package com.anggutierrez.reportsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ReportsServiceApplication {
	// Initial Branch Commit
	public static void main(String[] args) {
		SpringApplication.run(ReportsServiceApplication.class, args);
	}

	@GetMapping
	public String healthCheck() {
		return "HEALTH CHECK OK!";
	}

}
