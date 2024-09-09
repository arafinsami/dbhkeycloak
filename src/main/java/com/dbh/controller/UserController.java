package com.dbh.controller;

import com.dbh.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "users")
public class UserController {

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> userDTOS = Arrays.asList(new UserDTO(1, "Sami"),
                new UserDTO(2, "Sadi"),
                new UserDTO(3,"Sultan"),
                new UserDTO(4, "Irha")
        );
        return new ResponseEntity<>(userDTOS, HttpStatus.OK);
    }
}
