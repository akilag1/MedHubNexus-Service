package com.medhubnexus.project.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "login")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(name = "user_name", nullable = false)
    @Size(max = 100)
    private String login;
    
    @Column(name = "email", nullable = false)
    @Size(max = 50)
    private String email;

    @Column(name = "password", nullable = false)
    @Size(max = 100)
    private String password;
    
    @Column(name = "user_type", nullable = false)
    @Size(max = 15)
    private String userType;
    
}
