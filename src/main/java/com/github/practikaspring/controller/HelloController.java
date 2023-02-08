package com.github.practikaspring.controller;

import com.github.practikaspring.model.HelloModel;
import com.github.practikaspring.repository.HelloRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Autowired
    HelloRepository helloRepository;
    @PostMapping("/hello")
    public ResponseEntity<HelloModel> hello(HttpServletRequest httpServletRequest, @RequestBody  HelloModel model) {
        try {
            String clientIp = httpServletRequest.getRemoteAddr();
            HelloModel hello = helloRepository
                    .save(new HelloModel(model.getText(),clientIp));

            return new ResponseEntity<>(hello, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
