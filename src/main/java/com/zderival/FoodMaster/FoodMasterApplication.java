package com.zderival.FoodMaster;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodMasterApplication {

	public static void main(String[] args) {
		String profile = System.getProperty("spring.profiles.active", "default");
		String filename = ".env";
		if (!"default".equals(profile)) {
			filename = ".env." + profile;
		}

		Dotenv dotenv = Dotenv.configure()
				.filename(filename)
				.ignoreIfMissing()
				.load();
		
		dotenv.entries().forEach(entry -> {
			if (System.getProperty(entry.getKey()) == null) {
				System.setProperty(entry.getKey(), entry.getValue());
			}
		});
		
		SpringApplication.run(FoodMasterApplication.class, args);
	}

}
