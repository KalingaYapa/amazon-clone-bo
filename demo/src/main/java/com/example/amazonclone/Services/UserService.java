package com.example.amazonclone.Services;

import com.example.amazonclone.Entity.User;
import com.example.amazonclone.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    // submit data into the database
    public User saveUserData(User userData) {
        return userRepository.save(userData);
    }


    // get data from the database
    public User getUserDetailsFromDB(String uniqueId) {
        return userRepository.findAllByUniqueID(uniqueId);
    }
}