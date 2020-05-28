package com.margaritasosnovskaya.MyLocation.controllers;

import com.margaritasosnovskaya.MyLocation.dto.UserDTO;
import com.margaritasosnovskaya.MyLocation.mappers.UserMapper;
import com.margaritasosnovskaya.MyLocation.models.User;
import com.margaritasosnovskaya.MyLocation.repositories.UserRepository;
import com.margaritasosnovskaya.MyLocation.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.awt.*;

@RestController
@RequiredArgsConstructor
public class RegisterController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register/{id}")
    public UserDTO getUserInfo(@PathVariable Long id){
        User user = userService.getUser(id);
        return userMapper.toDTO(user);
    }

    @GetMapping("/users/{email}")
    public UserDTO getUserByEmail(@PathVariable String email){
        User user = userService.getUserByEmail(email);
        return userMapper.toDTO(user);
    }

    @PostMapping(value = "/register", consumes = { MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> saveUser(@Valid @RequestBody UserDTO userDTO){
        User user = userMapper.toEntity(userDTO);
        user = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
