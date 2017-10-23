package cn.guxiangfly.client2.controller;


import org.springframework.security.core.Authentication;
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
    public Authentication user(Authentication user){
        return user;
    }
}
