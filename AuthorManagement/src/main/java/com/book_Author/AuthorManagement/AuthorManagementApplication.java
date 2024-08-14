package com.book_Author.AuthorManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableEurekaClient
public class AuthorManagementApplication {
//	private EnableEurekaClient enableEurekaClient;
	public static void main(String[] args) {
		SpringApplication.run(AuthorManagementApplication.class, args);
	}

}
