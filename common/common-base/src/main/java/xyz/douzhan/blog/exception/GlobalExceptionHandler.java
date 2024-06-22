package xyz.douzhan.blog.exception;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;
import xyz.douzhan.blog.result.Result;

/**
 * 一些声明信息
 * Description:
 * date: 2024/6/21 23:48
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 404异常处理
     */
    @ExceptionHandler(value = NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Result<String> noHandlerFoundExceptionHandler(HttpServletRequest request, NoHandlerFoundException exception, HttpServletResponse response) {
        return commonHandler(request, response,
                exception,
                HttpStatus.NOT_FOUND.value(),
                exception.getMessage());
    }

    /**
     * 405异常处理
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Result<String> httpRequestMethodNotSupportedHandler(HttpServletRequest request, HttpRequestMethodNotSupportedException exception, HttpServletResponse response) {
        return commonHandler(request, response,
                exception,
                HttpStatus.METHOD_NOT_ALLOWED.value(),
                exception.getMessage());
    }

    /**
     * 415异常处理
     */
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public Result<String>  httpMediaTypeNotSupportedExceptionHandler(HttpServletRequest request, HttpMediaTypeNotSupportedException exception, HttpServletResponse response) {
        return commonHandler(request, response,
                exception,
                HttpStatus.UNSUPPORTED_MEDIA_TYPE.value(),
                exception.getMessage());
    }

    /**
     * 业务异常处理
     */
    @ExceptionHandler(value = BusinessException.class)
    private Result<String>  businessExceptionHandler(HttpServletRequest request, BasicException exception, HttpServletResponse response) {
        return commonHandler(request, response,
                exception,
                exception.getCode(),
                exception.getMessage());
    }

    /**
     * 500异常处理
     */
    @ExceptionHandler(value = Exception.class)
    public Result<String> serverInternalExceptionHandler(HttpServletRequest request, Exception exception, HttpServletResponse response) {
        return commonHandler(request, response,
                exception,
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                exception.getMessage());
    }

    /**
     * 异常处理数据处理
     */
    private Result<String> commonHandler(HttpServletRequest request, HttpServletResponse response,
                                       Exception exception, int code, String message) {
         return Result.fail(code,exception.getClass().getSimpleName()+message);
    }
}

