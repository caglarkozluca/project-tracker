package com.projectone.projecttracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ProjectTrackingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectTrackingSystemApplication.class, args);
	}

}

