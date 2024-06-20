package xyz.douzhan.blog.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.douzhan.blog.service.fallback.UserServiceFallback;

/**
 * 一些声明信息
 * Description:
 * date: 2024/6/20 17:59
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
@FeignClient(value = "blog-user",fallback = UserServiceFallback.class)
public interface UserService {
    @GetMapping("/user/test")
    String printHelloWorld();

    @GetMapping("/user/sentinel/test/{message}")
    String providerSentinelTest(@PathVariable("message") String message);

}
