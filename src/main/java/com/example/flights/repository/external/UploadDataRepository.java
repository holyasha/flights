package com.example.flights.repository.external;

import org.springframework.stereotype.Repository;

import com.example.flights.model.external.UploadData;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UploadDataRepository extends JpaRepository<UploadData, Long> {
}

