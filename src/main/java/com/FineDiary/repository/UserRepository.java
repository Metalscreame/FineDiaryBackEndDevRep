package com.FineDiary.repository;

import com.FineDiary.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    //@Query("select u from User u")
    List<String> findByName(String name);
    List<String> findByEmail(String name);
}

