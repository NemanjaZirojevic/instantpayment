package com.jwt.demo.security;

import com.jwt.demo.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtValidatior {

    private  String secret = "nemanja";


    public JwtUser validate(String token){

        JwtUser jwtUser =  null;
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
            Jws<Claims> claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            System.out.println("exp "+claims.getBody().getExpiration());
            if (claims.getBody().getExpiration().before(new Date())) {
                System.out.println("Usao ");
                return null;
            }
            jwtUser = new JwtUser();
            jwtUser.setTid((String) body.get("hashedUserId"));
        } catch (JwtException | IllegalArgumentException e) {
            throw new InvalidJwtAuthenticationException("Expired or invalid JWT token");
        }
        return jwtUser;
    }


}
