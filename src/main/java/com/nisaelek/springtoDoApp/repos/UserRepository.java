package com.nisaelek.springtoDoApp.repos;

import com.nisaelek.springtoDoApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer> {
}
