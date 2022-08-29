package com.example.amazonclone.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.amazonclone.Entity.User;

public interface UserRepository extends CrudRepository<User , Long> {
    // Data base connection handle this class

    User save(User user);
    User findAllByEmail(String Id);
}
