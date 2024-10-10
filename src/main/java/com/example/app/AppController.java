package com.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class AppController {
    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola mundo";
    }
    
    @GetMapping("/version")
    public String version() {
        return "0.1";
    }
}
