package com.occamsrazor.web;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootConfiguration
@RestController
public class HomeController {
    @GetMapping("/")
    public String hello() {
        return "Hello World~~즐거운 자바시간";
    }
}
