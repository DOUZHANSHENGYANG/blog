package xyz.blog.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 一些声明信息
 * Description:
 * date: 2024/6/20 22:04
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
@RestController
public class TestSentinelController {

    @GetMapping("/user/sentinel/test/{message}")
    @SentinelResource(value = "providerSentinelTest", blockHandler = "handlerBlockHandler")
    public String providerSentinelTest(@PathVariable("message") String message) {
        return "sentinel测试：" + message;
    }

    public String handlerBlockHandler(@PathVariable("message") String message, BlockException exception) {
        return "providerSentinelTest服务不可用，" + "触发sentinel流控配置规则"+"\t"+"o(╥﹏╥)o";
    }
}
