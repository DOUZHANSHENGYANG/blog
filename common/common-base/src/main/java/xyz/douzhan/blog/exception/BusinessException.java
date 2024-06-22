package xyz.douzhan.blog.exception;

import java.io.Serial;

/**
 * 一些声明信息
 * Description: 业务异常
 * date: 2024/6/21 23:47
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
public class BusinessException extends BasicException{
    @Serial
    private static final long serialVersionUID = 1L;

    public BusinessException(int code, String message) {
        super(code, message);
    }
}
