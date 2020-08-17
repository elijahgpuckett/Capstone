package com.tts.ecommerce.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tts.ecommerce.model.Shoe;

public interface ShoeRepository extends JpaRepository<Shoe, Long> {
    
}