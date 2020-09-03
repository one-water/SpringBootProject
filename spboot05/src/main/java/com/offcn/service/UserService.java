package com.offcn.service;

import com.offcn.pojo.User;

import java.util.List;

public interface UserService {

    //获取全部用户数据
     List<User> getUserList();
    //新增用户数据
     void createUser(User user);
    //获取指定id用户信息
      User getUser(Long id);
    //更新指定id用户信息
     void updateUser(User user);
    //删除指定id用户
     void deleteUser(Long id);

}
