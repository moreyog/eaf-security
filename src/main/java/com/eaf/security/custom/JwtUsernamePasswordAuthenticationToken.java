package com.eaf.security.custom;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class JwtUsernamePasswordAuthenticationToken extends UsernamePasswordAuthenticationToken {
    private String jwtToken;

    public JwtUsernamePasswordAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities, String jwtToken) {
        super(principal, credentials, authorities);
        this.jwtToken = jwtToken;
    }

    public String getJwtToken() {
        return jwtToken;
    }
}
