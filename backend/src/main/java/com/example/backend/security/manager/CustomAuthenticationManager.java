package com.example.backend.security.manager;

import com.example.backend.entities.User;
import com.example.backend.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class CustomAuthenticationManager implements AuthenticationManager {
    private UserService userServiceImpl;

    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        User user = userServiceImpl.getUser(authentication.getName());
        if (!passwordEncoder().matches(authentication.getCredentials().toString(), user.getPassword())) {
            throw new BadCredentialsException("You provided an incorrect password");
        }
        return new UsernamePasswordAuthenticationToken(authentication.getName(), user.getPassword());
    }
}
