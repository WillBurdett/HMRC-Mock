package com.example.HMRCmock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HmrcMockApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmrcMockApplication.class, args);
	}

}
