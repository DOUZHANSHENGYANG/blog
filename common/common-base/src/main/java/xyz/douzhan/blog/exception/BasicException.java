package xyz.douzhan.blog.exception;

import lombok.Getter;

import java.io.Serial;

/**
 * 一些声明信息
 * Description: 自定义基本异常
 * date: 2024/6/21 23:43
 *
 * @author 斗战圣洋
 * @since JDK 17
 */

@Getter
public class BasicException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    private int code = 0;

    public BasicException(int code, String message) {
        super(message);
        this.code = code;
    }

}
