package ru.gb.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringHomeWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHomeWorkApplication.class, args);
	}

}
