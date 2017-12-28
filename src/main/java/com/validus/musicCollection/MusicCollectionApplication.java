package com.validus.musicCollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.validus.musicCollection.repo")
@SpringBootApplication
public class MusicCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicCollectionApplication.class, args);
	}
}
