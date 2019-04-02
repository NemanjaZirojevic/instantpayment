package com.jwt.demo.security;

import com.jwt.demo.model.JwtAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthenticationTokenFilter extends AbstractAuthenticationProcessingFilter {

    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String TID_HEADER = "Terminal-Identification";

    public JwtAuthenticationTokenFilter() {
        super("/ips/**");
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws AuthenticationException, IOException, ServletException {
        String authorizationHeader = httpServletRequest.getHeader(HEADER_STRING);
        String tidValue = httpServletRequest.getHeader(TID_HEADER);
        if(authorizationHeader==null || !authorizationHeader.startsWith(TOKEN_PREFIX))
        {

            throw new RuntimeException("JWT token is missing!");

        }else if(tidValue == null || tidValue.isEmpty())
        {
            throw new RuntimeException("Terminal-Identification is missing!");

        }
        String tokenValue = authorizationHeader.replace(TOKEN_PREFIX,"");
        JwtAuthenticationToken jwtAuthenticationToken = new JwtAuthenticationToken(tokenValue,tidValue);
        return getAuthenticationManager().authenticate(jwtAuthenticationToken);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        super.successfulAuthentication(request, response, chain, authResult);
        chain.doFilter(request,response);
    }
}
