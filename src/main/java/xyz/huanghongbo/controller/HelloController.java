package xyz.huanghongbo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${xyz.huanghongbo.name}")
	private String name;

    @RequestMapping("/")
    public String hello(){
        return "Greetings from Spring Boot!" + name;
    }
}
