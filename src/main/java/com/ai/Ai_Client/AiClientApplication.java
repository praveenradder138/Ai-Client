package com.ai.Ai_Client;

import com.fasterxml.jackson.databind.annotation.EnumNaming;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiClientApplication.class, args);
	}

}
