package com.example.amazonclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AmazonCloneApplication {

	@RequestMapping("/")
    String home() {
        return "Hello Worldss!";
    }

	public static void main(String[] args) {
		SpringApplication.run(AmazonCloneApplication.class, args);
	}

}
