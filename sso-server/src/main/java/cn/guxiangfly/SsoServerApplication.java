package cn.guxiangfly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * SsoServerApplication
 *
 * @author guxiang
 * @date 2017/10/23
 */
@SpringBootApplication
@EnableAuthorizationServer
public class SsoServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsoServerApplication.class,args);
    }
}
