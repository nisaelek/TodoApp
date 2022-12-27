package com.nisaelek.springtoDoApp.services.Impl;

import com.nisaelek.springtoDoApp.dto.UserViewDTO;
import com.nisaelek.springtoDoApp.entities.User;
import com.nisaelek.springtoDoApp.exception.NotFoundException;
import com.nisaelek.springtoDoApp.repos.UserRepository;
import com.nisaelek.springtoDoApp.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

   private final UserRepository userRepository;



    @Override
    public UserViewDTO getOneUser(Long id) {
      final User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("Not found"));
      return UserViewDTO.of(user);
    }

    @Override
    public List getAllUsers() {
        return userRepository.findAll().stream().map(UserViewDTO::of).collect(Collectors.toList());
    }
}
