package com.lhm.controller;

import com.lhm.common.utils.common.Result;
import com.lhm.entity.model.Member;
import com.lhm.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.service.ResponseMessage;

/**
 * @author lhm
 * @date 2019/4/28 14:03
 **/
@Api(tags = "会员")
@RestController
@RequestMapping("member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @ApiOperation(httpMethod = "GET",value = "会员：登录")
    @GetMapping("/loginMember/{registerPhone}{loginPassWord}")
    public Result loginMember(@ApiParam("registerPhone") @PathVariable String registerPhone, @ApiParam("loginPassWord") @PathVariable String loginPassWord){
     return memberService.loginMember(registerPhone,loginPassWord);
    }

    @ApiOperation(httpMethod = "POST",value = "会员“注册")
    @PostMapping("/insertMember")
    public Result insertMember(@ApiParam("会员") @RequestBody Member member){
      return memberService.insertMember(member);
    }
}
