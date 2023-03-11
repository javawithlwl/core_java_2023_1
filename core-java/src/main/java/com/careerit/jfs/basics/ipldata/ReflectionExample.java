package com.careerit.jfs.basics.ipldata;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class ReflectionExample {

  public static void main(String[] args) {
    Map<String, Object> map = new HashMap<>();
    map.put("name","Dhoni");
    map.put("price",1800000);
    map.put("country","India");
    Player player = getObject(map, Player.class);
    System.out.println(player);
  }

  private static <T> T getObject(Map<String, Object> map, Class<T> cls) {
    T t;
    try {
      Constructor constructor = cls.getConstructor();
       t= (T) constructor.newInstance();
      map.entrySet().forEach(ele -> {
        try {
          Field field = FieldUtils.getDeclaredField(t.getClass(), ele.getKey(),true);
          field.setAccessible(true);
          field.set(t, ele.getValue());
        } catch (IllegalAccessException e) {
          throw new RuntimeException(e);
        }
      });

    } catch (NoSuchMethodException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    } catch (InstantiationException e) {
      throw new RuntimeException(e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    }
    return t;
  }

}
