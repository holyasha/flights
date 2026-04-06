package com.example.flights.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.flights.model.entities.UserFiles;
import com.example.flights.repository.UserFilesRepository;

@Service
public class UserFilesServiceImpl implements UserFilesService {

    private final UserFilesRepository userFilesRepository;

    public UserFilesServiceImpl(UserFilesRepository userFilesRepository) {
        this.userFilesRepository = userFilesRepository;
    }

    @Override
    public UserFiles saveFile(UserFiles userFiles) {
        return userFilesRepository.save(userFiles);
    }

    @Override
    public List<UserFiles> getAllUserFiles(String userId) {
        return userFilesRepository.findByUserId(userId);
    }
    
}
