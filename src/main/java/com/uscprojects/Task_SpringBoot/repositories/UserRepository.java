package com.uscprojects.Task_SpringBoot.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uscprojects.Task_SpringBoot.entitites.User;
import com.uscprojects.Task_SpringBoot.enums.UserRole;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findFirstByEmail(String email);
    Optional<User> findByUserRole(UserRole userRole);
    Optional<User> findByUsername(String username);
}
