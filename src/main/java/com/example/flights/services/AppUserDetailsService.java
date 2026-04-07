package com.example.flights.services;

import org.springframework.security.core.userdetails.UserDetails;

public interface AppUserDetailsService {

    public UserDetails loadUserByUsername(String username);
}
