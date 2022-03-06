package com.jlcindia.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBootApplication {
	public static void main(String as[]) {
		System.out.println("Hello Java1");
		System.out.println("Hello Java2");
		SpringApplication.run(MyBootApplication.class, as);
	}
}
