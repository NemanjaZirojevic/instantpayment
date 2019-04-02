package com.jwt.demo.security;


import com.jwt.demo.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Component
public class JwtGenerator {

    private  String secret = "nemanja";

    @Value("${security.jwt.token.expire-length:3600000}")
    private long validityInMilliseconds = 10000;


    public String generate(JwtUser jwtUser) {


        Claims claims = Jwts.claims()
                .setSubject(jwtUser.getHashedUserId());
        claims.put("tid", String.valueOf(jwtUser.getTid()));
        claims.put("role", "ROLE_USER");

        Date now = new Date();
        System.out.println("Expiration toke : "+new Date(now.getTime()+90000));


        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setSubject(getSaltString())
                .setAudience(getSaltString())
                .setIssuer(getSaltString())
                .setExpiration(new Date(now.getTime() + 90000))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();

    }

    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
