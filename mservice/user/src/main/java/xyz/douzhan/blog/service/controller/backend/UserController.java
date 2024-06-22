package xyz.douzhan.blog.service.controller.backend;

import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import xyz.douzhan.blog.api.domain.dto.UserDTO;
import xyz.douzhan.blog.result.Result;
import xyz.douzhan.blog.service.domain.entity.User;
import xyz.douzhan.blog.service.service.UserService;
import xyz.douzhan.blog.utils.transfer.DomainUtil;

import java.lang.reflect.InvocationTargetException;

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
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Result<User> get(@PathVariable("id") Integer id) {
        return Result.success(userService.getById(id));
    }

    @PutMapping()
    public Result<Boolean> update(@RequestBody UserDTO userDTO) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return Result.success(userService.updateById((User) DomainUtil.dto2Entity(userDTO, User.class)));
    }
}
