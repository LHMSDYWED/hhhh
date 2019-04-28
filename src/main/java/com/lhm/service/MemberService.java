package com.lhm.service;

import com.lhm.common.utils.common.Result;
import com.lhm.entity.model.Member;
import springfox.documentation.service.ResponseMessage;

/**
 * @author lhm
 * @date 2019/4/28 11:42
 **/
public interface MemberService {
    /**
     * 用户登录
     * @param registerPhone
     * @return
     */
    Result loginMember(String registerPhone, String loginPassWord);

    /**
     * 用户注册
     * @param member
     * @return
     */
    Result insertMember(Member member);
}
