package com.javanauta.aprendendospring.controller;

import com.javanauta.aprendendospring.infrastructure.security.UserDetailsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserDetailsServiceImpl userDetailsService;

    @GetMapping
    public UserDetails getUserByEmail(@RequestParam("email") String email){
        return userDetailsService.loadUserByUsername(email);
    }
}
