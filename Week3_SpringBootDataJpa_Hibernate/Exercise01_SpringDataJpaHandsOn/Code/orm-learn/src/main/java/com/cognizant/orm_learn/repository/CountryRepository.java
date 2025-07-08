package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    // 1️⃣ Find countries where name contains substring (case-insensitive)
    List<Country> findByNameContainingIgnoreCase(String keyword);

    // 2️⃣ Find and sort by name
    List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String keyword);

    // 3️⃣ Find countries starting with a specific letter
    List<Country> findByNameStartingWithIgnoreCase(String letter);
}
