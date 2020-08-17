package com.tts.ecommerce.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tts.ecommerce.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}