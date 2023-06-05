package com.BlogPostOne.BlogDemo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/welcomePage")
@RestController
public class BlogDemoController {
    @GetMapping
    public String loadWelcomeMessage(){
        return "Hello World, Welcome to Spring Boot";
    }
}
