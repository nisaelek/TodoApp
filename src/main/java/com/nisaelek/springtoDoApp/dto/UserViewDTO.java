package com.nisaelek.springtoDoApp.dto;

import com.nisaelek.springtoDoApp.entities.User;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Optional;

public final class UserViewDTO implements Serializable {
      private  static final long serialVerisonUID=1L;
      private final String name;
      private final String surname;
      private final String email;
      private final String password;


    public UserViewDTO(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public static @NotNull UserViewDTO of (User user){
        return new UserViewDTO(user.getName(),user.getSurname(),user.getEmail(),user.getPassword());
    }
}
