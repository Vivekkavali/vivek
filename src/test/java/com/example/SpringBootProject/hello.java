package com.example.SpringBootProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/welcome")
    public String sayHello(){
        return "  Hello world .... !  ~  This is Vivek ...llll  " ;
    }
}
