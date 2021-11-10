package com.test.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.test.*")
public class StockAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockAppApplication.class, args);
	}

}
