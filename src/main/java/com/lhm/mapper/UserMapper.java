package com.lhm.mapper;

import com.lhm.common.utils.MyMapper;
import com.lhm.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * @author lhm
 * @date 2019/4/26 14:24
 **/
@Mapper
public interface UserMapper extends MyMapper<User> {
    /**
     *  获取用户信息
     * @return
     */
    List<User> getUsers();
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
