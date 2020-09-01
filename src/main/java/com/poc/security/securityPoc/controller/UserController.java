package com.poc.security.securityPoc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/user/{name}")
    private ResponseEntity<String> helloMundo(@PathVariable("name") String name) {
        return ResponseEntity.ok("Ola " + name);
    }

    @GetMapping("/batata/{name}")
    private ResponseEntity<String> helloBatata(@PathVariable("name") String batata) {
        return ResponseEntity.ok("Ola batata " + batata);
    }

    @GetMapping("/mundo")
    private ResponseEntity<String> helloMundo() {
        return ResponseEntity.ok("Ola Mundo");
    }
}
