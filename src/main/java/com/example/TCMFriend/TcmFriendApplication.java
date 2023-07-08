package com.example.TCMFriend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TcmFriendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcmFriendApplication.class, args);
	}

}
