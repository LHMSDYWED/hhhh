package com.lhm.service.impl;

import com.github.pagehelper.Page;
import com.lhm.common.utils.Common;
import com.lhm.entity.User;
import com.lhm.mapper.UserMapper;
import com.lhm.service.AbstractService;
import com.lhm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;
import java.util.Map;

/**
 * @author lhm
 * @date 2019/4/26 14:32
 **/
@Service
public class UserServiceImplement extends AbstractService<User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Page<User> getUsers(Map<String,String> params) {
        //redis.set("name","chenjunwen"); reids测试
        Condition serviceCondition = Common.getServiceCondition(params, User.class);
        List<User> orders = findByCondition(serviceCondition);
        return (Page<User>) orders;
    }


    @Override
    public User login(String name) {
        return userMapper.login(name);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public Integer updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public Integer createUser(User user) {
        return userMapper.createUser(user);
    }

    @Override
    public Integer delUser(Integer id) {
        return userMapper.delUser(id);
    }
}
