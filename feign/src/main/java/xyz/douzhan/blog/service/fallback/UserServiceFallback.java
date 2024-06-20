package xyz.douzhan.blog.service.fallback;

import org.springframework.stereotype.Component;
import xyz.douzhan.blog.service.UserService;

/**
 * 一些声明信息
 * Description:
 * date: 2024/6/20 22:10
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
@Component
public class UserServiceFallback implements UserService {

    @Override
    public String printHelloWorld() {
        return "对方服务不可用，开始服务降级处理";
    }

    @Override
    public String providerSentinelTest(String message) {
        return "对方服务不可用，开始服务降级处理";
    }
}
