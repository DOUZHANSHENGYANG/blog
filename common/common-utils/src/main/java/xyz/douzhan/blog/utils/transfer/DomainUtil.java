package xyz.douzhan.blog.utils.transfer;

import org.springframework.beans.BeanUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 一些声明信息
 * Description:
 * date: 2024/6/22 17:06
 *
 * @author 斗战圣洋
 * @since JDK 17
 */
public class DomainUtil {
    /**
     * DTO 转换为 实体
     * @param dto
     * @param entityClazz
     * @return Object
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static Object dto2Entity(Object dto,Class entityClazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor constructor = entityClazz.getDeclaredConstructor();
        Object entity = constructor.newInstance();
        BeanUtils.copyProperties(dto,entity);
        return entity;
    }
}
