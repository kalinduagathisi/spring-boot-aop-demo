package com.kalicoder.springaopdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAopDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args){
		return runner -> {
			System.out.println("Hellow World!");
		};
	}ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIHf2tTAXs057suSIvb736pbKBz4oH7KzxjREwMjPxxZQ kalinduagathisi@gmail.com


}
