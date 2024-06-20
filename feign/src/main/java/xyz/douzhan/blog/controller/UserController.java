package xyz.douzhan.blog.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.douzhan.blog.service.UserService;

/**
 * 一些声明信息
 * Description:
 * date: 2024/6/20 18:02
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
@Slf4j
@RestController
@RequestMapping("/feign/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/test")
    public String test() {
        long start = System.currentTimeMillis();
        log.info("调用provider开始，{}", start);
        String result;
        try {
            result = userService.printHelloWorld();
        } catch (Exception e) {
            log.info("调用provider结束，{}ms", System.currentTimeMillis()-start);
            throw new RuntimeException(e);
        }
        return result;
    }
    @GetMapping("/sentinel/test/{message}")
    public String sentinelTest(@PathVariable("message")String message) {
        return userService.providerSentinelTest(message);
    }


}

