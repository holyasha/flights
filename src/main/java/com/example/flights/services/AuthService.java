package com.example.flights.services;

import com.example.flights.model.auth.UserRegistrationDto;
import com.example.flights.model.entities.User;
import com.example.flights.model.enums.UserRoles;

public interface AuthService {
    User register(UserRegistrationDto registrationDTO);

    User getUser(String username);

    Integer getCountUsers(UserRoles role);
}

