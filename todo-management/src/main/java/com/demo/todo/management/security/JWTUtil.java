package com.demo.todo.management.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service
public class JWTUtil {

    private static final int EXPIRE_IN_MS = 300 * 1000;

    private static final Key KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public String generate(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuer("org.com")
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_IN_MS))
                .signWith(KEY).compact();
    }

    public boolean validate(String token){
            if(getUserName(token) != null && isExpired(token)){
                return true;
            }
            return false;
    }

    public boolean isExpired(String token) {
        return getClaims(token)
                .getExpiration().after(new Date(System.currentTimeMillis()));
    }

    public String getUserName(String token) {
        return  getClaims(token).getSubject();
    }

    private static Claims getClaims(String token){
        return Jwts.parser().setSigningKey(KEY).build().parseClaimsJws(token).getBody();
    }
}
