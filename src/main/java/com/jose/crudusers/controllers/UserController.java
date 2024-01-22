package com.jose.crudusers.controllers;

import com.jose.crudusers.DTO.UserRequestDTO;
import com.jose.crudusers.DTO.UserResponseDTO;
import com.jose.crudusers.model.User;
import com.jose.crudusers.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    UserServices userServices;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponseDTO postUser(@RequestBody User user){

        return userServices.createUser(user);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponseDTO getUserById(@PathVariable Long id){
        return userServices.getUserById(id);
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserResponseDTO> getAllUsers(){
        return userServices.getAllUsers();
    }

    @PatchMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponseDTO updateUser(@PathVariable Long id, @RequestBody Map<String, Object> fields){
        return userServices.updateUser(id, fields);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id){
        userServices.deleteUser(id);
    }
}
