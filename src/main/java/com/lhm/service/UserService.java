package com.lhm.service;

import com.github.pagehelper.Page;
import com.lhm.entity.User;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author lhm
 * @date 2019/4/26 14:27
 **/
public interface UserService {
    /**
     *  获取用户信息
     * @return
     */
    Page<User> getUsers(Map<String,String> params);

    /**
     * 登录
     * @param name
     * @return
     */
    User login(String name);

    /**
     * 根据id获取user
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 修改
     * @param user
     * @return
     */
    Integer updateUser(User user);

    /**
     * 新增
     * @param user
     * @return
     */
    Integer createUser(User user);

    /**
     * 删除
     * @param id
     * @return
     */
    Integer delUser(Integer id);
}
