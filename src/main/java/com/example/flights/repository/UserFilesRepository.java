package com.example.flights.repository;

import com.example.flights.model.entities.UserFiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserFilesRepository extends JpaRepository<UserFiles, String> {
    List<UserFiles> findByUserId(String userId);
    List<UserFiles> findByUserIdOrderByUploadDateDesc(String userId);
}

