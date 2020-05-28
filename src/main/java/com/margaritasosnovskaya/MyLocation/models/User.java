package com.margaritasosnovskaya.MyLocation.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "email", nullable = false, length = 245)
    private String email;
    @Basic
    @Column(name = "name", nullable = false, length = 245)
    private String name;
    @Basic
    @Column(name = "password", nullable = false, length = 245)
    private String password;
}
