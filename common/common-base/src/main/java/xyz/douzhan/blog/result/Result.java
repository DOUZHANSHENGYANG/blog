package xyz.douzhan.blog.result;

import lombok.Data;

/**
 * 一些声明信息
 * Description: 统一结果类
 * date: 2024/6/22 0:06
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private  T data;

    private Result(T data) {
        this.code = 200;
        this.msg = "success";
        this.data = data;
    }

    private Result(T data, boolean success, String msg) {
        if (success) {
            this.code = 200;
            this.msg = "success";
        } else {
            this.code = 500;
            this.msg = msg;
        }
        this.data = data;
    }

    private Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(data);
    }

    public static <T> Result<T> fail(String msg) {
        return new Result<>(500, msg);
    }

    public static <T> Result<T> fail(Integer code, String msg) {
        return new Result<>(code, msg);
    }


}
