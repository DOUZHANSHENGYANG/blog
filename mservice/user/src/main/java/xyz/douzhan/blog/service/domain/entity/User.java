package xyz.douzhan.blog.service.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * 一些声明信息
 * Description:
 * date: 2024/6/20 23:38
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private String id;
    private String name;
    private String password;
    private String avatar;
    private String github;
    private String mail;
    private String qq;
    private String bilibili;
    private String motto;
    @TableField(fill = FieldFill.INSERT)
    private String createdAt;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String updatedAt;
}
