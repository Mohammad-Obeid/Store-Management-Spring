package com.example.youtCourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.example.youtCourse.repository")
public class YoutCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoutCourseApplication.class, args);
	}

}
