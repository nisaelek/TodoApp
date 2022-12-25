package com.nisaelek.springtoDoApp.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todos")
@Data
public class Todo {

    @Id
    private int id;
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "todo",length = 250)
    private String todo;
    @Column(name = "status")
    private String status;


}
