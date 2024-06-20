package xyz.douzhan.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 一些声明信息
 * Description:
 * date: 2024/6/20 17:58
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
