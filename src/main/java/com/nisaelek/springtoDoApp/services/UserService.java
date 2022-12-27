package com.nisaelek.springtoDoApp.services;

import com.nisaelek.springtoDoApp.dto.UserViewDTO;
import com.nisaelek.springtoDoApp.entities.User;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface UserService {
   UserViewDTO getOneUser(Long id) ;
   //User değil UserViewDTO döncek

   List<UserViewDTO> getAllUsers() ;
}
