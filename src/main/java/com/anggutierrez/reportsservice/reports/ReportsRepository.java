package com.anggutierrez.reportsservice.reports;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportsRepository extends JpaRepository<Item, Long> {
    List<Item> findByName(String name);
}