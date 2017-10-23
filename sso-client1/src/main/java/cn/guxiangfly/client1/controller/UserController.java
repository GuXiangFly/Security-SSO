package cn.guxiangfly.client1.controller;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author guxiang
 * @date 2017/10/23
 */
@RestController
public class UserController {


    @GetMapping("/user/me")
    public Authorization user(Authorization user){
        return user;
    }
}
