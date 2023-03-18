package io.security.springsecurity.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Account {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private Integer age;
    private String role;
}
