package com.example.lma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {
	
	@RequestMapping("/")
	String index() {
		return "index";
	}

    @RequestMapping("/home")
    @ResponseBody
    String home() {
      return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}