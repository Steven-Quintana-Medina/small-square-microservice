package com.pragma.powerup.smallsquaremicroservice.config.security.jwt;

public interface JwtService {
    Long getIdToken(String token);
}
