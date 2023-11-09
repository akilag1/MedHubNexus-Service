package com.medhubnexus.project.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;

import java.util.Date;

@Data
@Entity(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String password;
    private String nic;
    private String address;
    private String telNumber;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date dateOfBirth;
    @Email
    private String email;

}
