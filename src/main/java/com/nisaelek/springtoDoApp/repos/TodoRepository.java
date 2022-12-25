package com.nisaelek.springtoDoApp.repos;

import com.nisaelek.springtoDoApp.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Integer> {
}
