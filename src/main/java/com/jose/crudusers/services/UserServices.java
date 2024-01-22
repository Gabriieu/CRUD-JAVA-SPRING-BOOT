package com.jose.crudusers.services;

import com.jose.crudusers.DTO.UserResponseDTO;
import com.jose.crudusers.exceptions.ResourceNotFoundException;
import com.jose.crudusers.mapper.Mapper;
import com.jose.crudusers.model.User;
import com.jose.crudusers.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public UserResponseDTO createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return Mapper.parseObject(userRepository.save(user), UserResponseDTO.class);
    }

    public UserResponseDTO getUserById(Long id) {
        var userFound = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("user not found."));

        return Mapper.parseObject(userFound, UserResponseDTO.class);
    }

    public List<UserResponseDTO> getAllUsers() {
        return Mapper.parseListObjects(userRepository.findAll(), UserResponseDTO.class);
    }

    public UserResponseDTO updateUser(Long id, Map<String, Object> fields) {
        var userFound = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("user not found."));

        fields.forEach((propertyName, propertyValue) -> {
            if (propertyName.equals("username")) {
                userFound.setUsername((String) propertyValue);
            }
            if (propertyName.equals("email")) {
                userFound.setEmail((String) propertyValue);
            }
            if (propertyName.equals("password")) {
                String encryptedPassword = passwordEncoder.encode((String) propertyValue);
                userFound.setPassword(encryptedPassword);
            }

        });
        userRepository.save(userFound);

        return Mapper.parseObject(userFound, UserResponseDTO.class);
    }

    public void deleteUser(Long id) {
        User userFound = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("user not found."));

        userRepository.delete(userFound);
    }
}
