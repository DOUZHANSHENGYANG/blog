package xyz.douzhan.blog.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.douzhan.blog.service.domain.entity.User;
import xyz.douzhan.blog.service.mapper.UserMapper;
import xyz.douzhan.blog.service.service.UserService;

/**
 * 一些声明信息
 * Description:
 * date: 2024/6/22 16:46
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
