package com.github.practikaspring.controller;

import com.github.practikaspring.model.HelloModel;
import com.github.practikaspring.repository.HelloRepository;
import com.github.practikaspring.response.HelloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Autowired
    HelloRepository helloRepository;
    @PostMapping("/hello")
    public ResponseEntity<HelloModel> hello() {
        try {
            HelloModel hello = helloRepository
                    .save(new HelloModel());
            return new ResponseEntity<>(helloRepository.getById(hello.getId()), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
