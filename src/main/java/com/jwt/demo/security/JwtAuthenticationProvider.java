package com.jwt.demo.security;

import com.jwt.demo.model.JwtAuthenticationToken;
import com.jwt.demo.model.JwtUser;
import com.jwt.demo.model.JwtUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JwtAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    @Autowired
    private JwtValidatior jwtValidatior;

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken) throws AuthenticationException {

    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken) throws AuthenticationException {
        JwtAuthenticationToken jwtAuthenticationToken = (JwtAuthenticationToken) usernamePasswordAuthenticationToken;
        String token = jwtAuthenticationToken.getTokenValue();
        String tid = jwtAuthenticationToken.getTid();
        JwtUser jwtUser = (JwtUser) jwtValidatior.validate(token);
        if(jwtUser==null)
        {
            System.out.println("Usao u validaciju");
                throw new RuntimeException("JWT token is not valid");
        }
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
       return new JwtUserDetails(token,grantedAuthorities);

    }

    @Override
    public boolean supports(Class<?> aClass) {

        return (JwtAuthenticationToken.class.isAssignableFrom(aClass));
    }
}
