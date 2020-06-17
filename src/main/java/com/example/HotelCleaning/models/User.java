package com.example.HotelCleaning.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String username;
    private String password;
    private String userType;
    private String fullName;
    private String image;
}
