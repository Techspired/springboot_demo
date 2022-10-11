package com.yms.demo;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public String name;

    // Constructor, getters and setters
}