package com.example.flights.repository.external;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flights.model.external.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    Optional<Company> findByApiToken(String apiToken);

    boolean existsByApiToken(String apiToken);
}
