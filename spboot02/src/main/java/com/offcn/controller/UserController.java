package com.offcn.controller;

import com.offcn.pojo.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private List<User> listUser = new ArrayList<User>();

    /**
     * 新增用户
     * @param user
     * @return
     */
    @PostMapping("/")
    @ApiOperation(value="新增用户", notes="新增用户信息")
    @ApiImplicitParam(name = "user", value = "用户信息实体user", required = true, dataType = "User")
    public List<User> createUser(@RequestBody User user) {
        listUser.add(user);
        return listUser;
    }

    /**
     *  获取全部用户信息
     * @return
     */
    @GetMapping("/")
    @ApiOperation(value="获取全部用户信息", notes="获取全部用户列表信息")
    public List<User> getUserList(){
        return listUser;
    }

    /**
     * 获取指定id用户信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @ApiOperation(value="获取指定id用户信息", notes="根据id获取单个用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    public User getUser(@PathVariable("id")Long id) {
        for (User user : listUser) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    /**
     * 更新指定id用户信息
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    public List<User> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        for (User temp : listUser) {
            if(temp.getId() == id) {
                temp.setName(user.getName());
                temp.setAge(user.getAge());
            }
        }
        return listUser;
    }

    /**
     * 删除指定id用户
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        listUser.remove(getUser(id));
        return "success";
    }

}