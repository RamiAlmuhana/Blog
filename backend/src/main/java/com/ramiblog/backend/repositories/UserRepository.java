package com.ramiblog.backend.repositories;

import com.ramiblog.backend.models.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<CustomUser, Long> {
    CustomUser findByEmail(String email);
}
