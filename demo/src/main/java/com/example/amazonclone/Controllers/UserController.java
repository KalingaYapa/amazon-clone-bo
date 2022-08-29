package com.example.amazonclone.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.amazonclone.Entity.User;
import com.example.amazonclone.Services.UserService;

@RestController
@RequestMapping("/amazon/users/")
public class UserController {
    @Autowired
    UserService userService;
        
    @PostMapping("saveUserDetails")
    public User saveUserDetails(@RequestBody User userData) {
        return userService.saveUserData(userData);
    }

    @GetMapping("getUserDetails/{userID}")
    public User getUserData(@PathVariable String email) {
        return userService.getUserDetailsFromDB(email);
    }
}
