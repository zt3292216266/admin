package com.jk.service;

import com.jk.entity.User;
import com.jk.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> queryUser() {
        System.out.println("serviceImpl");
        return userMapper.queryUser();
    }
}
