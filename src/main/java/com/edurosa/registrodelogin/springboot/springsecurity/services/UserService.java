package com.edurosa.registrodelogin.springboot.springsecurity.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.edurosa.registrodelogin.springboot.springsecurity.model.User;
import com.edurosa.registrodelogin.springboot.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}