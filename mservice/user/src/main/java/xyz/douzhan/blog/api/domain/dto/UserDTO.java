package xyz.douzhan.blog.api.domain.dto;

import lombok.Data;

/**
 * 一些声明信息
 * Description:
 * date: 2024/6/22 16:56
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
@Data
public class UserDTO {
    private String id;
    private String name;
    private String password;
    private String avatar;
    private String github;
    private String mail;
    private String qq;
    private String bilibili;
    private String motto;
}
