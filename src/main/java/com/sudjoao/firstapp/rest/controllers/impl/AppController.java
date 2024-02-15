package com.sudjoao.firstapp.rest.controllers.impl;
import com.sudjoao.firstapp.rest.controllers.AppControllerInterface;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController implements AppControllerInterface {
    @Override
    public String sayHello() {
        return "Hello world";
    }
}
