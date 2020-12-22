package io.dtwo.api.signup;

import io.dtwo.api.signup.repository.PlayerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = {
		PlayerRepository.class
})
public class SignupApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignupApiApplication.class, args);
	}

}
