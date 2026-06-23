package com.safepay.ims_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
		scanBasePackages = "com.safepay"
)
@EnableJpaRepositories(basePackages = "com.safepay.ims_supplier.repositories.jpa")
@EntityScan(basePackages = "com.safepay.ims_supplier.models")
public class ImsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImsAppApplication.class, args);
	}

}
