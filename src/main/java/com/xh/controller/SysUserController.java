package com.xh.controller;


import com.xh.entity.SysUser;
import com.xh.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author xiaohe
 * @since 2019-06-04
 */
@RestController
@Slf4j
public class SysUserController {

    @Autowired
    private SysUserService userService;

    @GetMapping("test")
    public void test(){
        SysUser user = userService.findUserByFirstDb(1);
        log.info("第一个数据库 : [{}]", user.toString());
        SysUser user2 = userService.findUserBySecondDb(1);
        log.info("第二个数据库 : [{}]", user2.toString());
    }
}
