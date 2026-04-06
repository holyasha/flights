package com.example.flights.services;

import java.util.List;

import com.example.flights.model.entities.UserFiles;

public interface UserFilesService {
    UserFiles saveFile(UserFiles userFiles);

    List<UserFiles> getAllUserFiles(String userId);
}
