package com.FineDiary.service;

import com.FineDiary.entity.User;
import com.FineDiary.repository.UserRepository;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public User findUserById(Integer id) {
        return userRepository.findOne(id);
    }

//    @Override
//    public User findUserByEmail(String email) {
//        User user = new User();
//        user.setEmail(email);
//        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220");
//        return user;
//    }

    @Override
    @Transactional
    public User create(User user) {
        //sha-1 encoding before saving to the database
        String shaPasswordEncoded = DigestUtils.sha1Hex(user.getPassword());
        user.setPassword(shaPasswordEncoded);
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public List<String> findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    @Transactional
    public List<String> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }


}
