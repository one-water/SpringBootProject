package com.offcn.service.impl;

import com.offcn.dao.UserRepository;
import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository ur;

    @Override
    public List<User> getUserList() {
        return ur.findAll();
    }

    @Override
    public void createUser(User user) {
        ur.save(user);
    }

    @Override
    public User getUser(Long id) {
        return ur.findById(id).get();
    }

    @Override
    public void updateUser(User user) {
        ur.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        ur.deleteById(id);
    }

}