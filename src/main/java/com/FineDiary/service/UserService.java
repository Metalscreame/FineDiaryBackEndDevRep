package com.FineDiary.service;

import com.FineDiary.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService{
    User findUserById(Integer id);
    //User findUserByEmail(String email);
    User create(User user);
    List<String> findByName(String name);
    List<String> findByEmail(String name);

//    @Query("from User p where p.email = ?")
//    User findByEmail(User user);
}
