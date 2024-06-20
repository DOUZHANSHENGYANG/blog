package xyz.douzhan.blog.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 一些声明信息
 * Description:
 * date: 2024/6/20 18:09
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
@Configuration
public class FeignConfig {

    @Bean
    public Retryer myRetryer() {
        // 初始间隔时间为100ms，最大间隔时间为1s，重试2次（总共请求3次，包括第1次，所以重试次数为2次）
        return new Retryer.Default(100, 1, 3);
    }

//    @Bean
//    Logger.Level feignLoggerLevel() {
//        // 日志级别配置
//        return Logger.Level.FULL;
//    }
}

