package xyz.blog.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 一些声明信息
 * Description:
 * date: 2024/6/20 17:42
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
@RefreshScope
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/test")
    public String printHelloWorld(){
        return "HelloWorld";
    }
}
