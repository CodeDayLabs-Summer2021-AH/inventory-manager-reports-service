package com.anggutierrez.reportsservice.reports;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportsService {
    private final ReportsRepository reportsRepository;

    @Autowired
    public ReportsService(ReportsRepository reportsRepository) {
        this.reportsRepository = reportsRepository;
    }

    public List<Item> getItems(Optional<String> query) {
        if (query.isPresent()) {
            try {
                Long id = Long.parseLong(query.get());
                Optional<Item> item = reportsRepository.findById(id);

                if (item.isPresent()) {
                    return List.of(item.get());
                } else {
                    return List.of();
                }
            } catch (NumberFormatException e) {
                return reportsRepository.findByName(query.get());
            }
        } else {
            return reportsRepository.findAll();
        }
    }
}