package com.jd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyJenkinDockerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyJenkinDockerAppApplication.class, args);
		System.out.println("Hello Docker");
	}

}
