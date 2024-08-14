package com.ramiblog.backend.utils;

import com.ramiblog.backend.models.CustomUser;
import com.ramiblog.backend.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component
@AllArgsConstructor
public class Seeder {
    private UserRepository userRepository;


    @EventListener
    public void seed(ContextRefreshedEvent event){
        List<CustomUser> users = this.userRepository.findAll();
        if (!users.isEmpty()) {
            return;
        }
        this.seedUsers();
    }



    private void seedUsers(){
        CustomUser adminUser = new CustomUser();
        adminUser.setName("Test");
        adminUser.setInfix("");
        adminUser.setLastName("Test");
        adminUser.setEmail("test@mail.com");
        adminUser.setPassword(new BCryptPasswordEncoder().encode("Test123!"));
        adminUser.setRole("admin");
        userRepository.save(adminUser);
    }


}
