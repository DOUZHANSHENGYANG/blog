package xyz.douzhan.blog.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 一些声明信息
 * Description:
 * date: 2024/6/20 17:40
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"xyz.douzhan.blog"})
@MapperScan("xyz.douzhan.blog.service.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
