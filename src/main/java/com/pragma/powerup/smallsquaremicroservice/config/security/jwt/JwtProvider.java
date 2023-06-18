package com.pragma.powerup.smallsquaremicroservice.config.security.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Collection;
import java.util.Collections;

@Component
public class JwtProvider implements JwtService {
    private final static Logger logger = LoggerFactory.getLogger(JwtProvider.class);
    private final Key secretKey;
    @Value("${jwt.expiration}")
    private int expiration;

    public JwtProvider(@Value("${jwt.secret}") String key) {
        this.secretKey = Keys.hmacShaKeyFor(key.getBytes());
    }

    public boolean validate(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(secretKey).build().parseClaimsJws(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }

    public Collection<? extends GrantedAuthority> getAuthorities(String token) {
        Claims auth = Jwts.parserBuilder().setSigningKey(secretKey).build().parseClaimsJws(token).getBody();
        return Collections.singletonList(new SimpleGrantedAuthority(auth.get("rol").toString()));
    }

    @Override
    public Long getIdToken(String token) {
        return Long.parseLong(Jwts.parserBuilder().
                setSigningKey(secretKey).
                build().parseClaimsJws(token.substring(7))
                .getBody().getId());
    }
}
