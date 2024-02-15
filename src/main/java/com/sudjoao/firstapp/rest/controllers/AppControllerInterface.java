package com.sudjoao.firstapp.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface AppControllerInterface {
    @GetMapping("/")
    String sayHello();
}
