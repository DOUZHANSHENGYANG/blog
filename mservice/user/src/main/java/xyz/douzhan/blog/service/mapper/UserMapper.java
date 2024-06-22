package xyz.douzhan.blog.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import xyz.douzhan.blog.service.domain.entity.User;

/**
 * 一些声明信息
 * Description:
 * date: 2024/6/22 16:47
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
