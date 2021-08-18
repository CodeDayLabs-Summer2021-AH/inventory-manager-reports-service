package com.anggutierrez.reportsservice.reports;

import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class ReportsConfig {
    @Bean
    CommandLineRunner commandLineRunner(ReportsRepository reportsRepository) {
        return args -> {
            Item a = new Item(1289, "Oatmeal Raisin Cookies", "Row 1", "Section 2", 200, new Date());
            Item b = new Item(6128, "iPhone 22 MK Ultra", "Row 3", "Section 2", 99, new Date());
            Item c = new Item(3667, "Cymbal-Banging Monkey", "Row 2", "Section 5", 200, new Date());

            Location location = new Location(List.of(a, b, c));

            reportsRepository.save(location);
        };
    }
}