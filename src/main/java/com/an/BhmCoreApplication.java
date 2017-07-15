package com.an;

import com.an.model.User;
import com.an.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.an")
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class BhmCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BhmCoreApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository){

		return args -> {
			User user = userRepository.findFirstByUserName("arafat");
			System.out.println(user.toString());
		};
	}

}
