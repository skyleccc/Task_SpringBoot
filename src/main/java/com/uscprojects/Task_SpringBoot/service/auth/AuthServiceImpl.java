package com.uscprojects.Task_SpringBoot.service.auth;

import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.uscprojects.Task_SpringBoot.entitites.User;
import com.uscprojects.Task_SpringBoot.enums.UserRole;
import com.uscprojects.Task_SpringBoot.repositories.UserRepository;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{
    private final UserRepository userRepository;

    @PostConstruct
    public void createAdminAccount() {
        Optional<User> user = userRepository.findByUserRole(UserRole.ADMIN);
        if(user.isEmpty()){
            User admin = new User();
            admin.setUsername("admin");
            admin.setPassword(new BCryptPasswordEncoder().encode("admin"));
            admin.setEmail("admin@test.com");
            admin.setUserRole(UserRole.ADMIN);
            userRepository.save(admin);
            System.out.println("Admin account created successfully.");
        } else {
            System.out.println("Admin account already exists.");
        }
    }


}
