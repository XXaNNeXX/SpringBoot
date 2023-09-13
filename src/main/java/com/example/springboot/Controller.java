package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {

    @GetMapping
    public String sayHello() {
        return "Hello, World!";
    }
    @GetMapping("/{name}")
    public String sayMyName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
