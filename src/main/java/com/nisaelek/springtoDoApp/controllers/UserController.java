package com.nisaelek.springtoDoApp.controllers;

import com.nisaelek.springtoDoApp.dto.UserViewDTO;
import com.nisaelek.springtoDoApp.entities.User;
import com.nisaelek.springtoDoApp.repos.UserRepository;
import com.nisaelek.springtoDoApp.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private UserService userService;
    private final UserRepository userRepository;

    @GetMapping("/{userId}")
   public ResponseEntity<UserViewDTO> getOneUser (@PathVariable Long id) {
        final UserViewDTO user = userService.getOneUser(id);
        return ResponseEntity.ok(user);
    }
    @GetMapping
    public List<UserViewDTO> getAllUsers() {
        final List<UserViewDTO> users= userService.getAllUsers();
        return ResponseEntity.ok(users).getBody();
    }
     }




