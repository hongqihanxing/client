package com.thing.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/**
 * Json对象转换工具类
 *
 * @author zhanghongqi21
 * @create 2018-05-31 15:27
 **/
public class JsonUtil {

    /**
     * @param object
     * @return
     * @Description:对象转Json字符串
     * @Author: zhanghongqi1
     * @Date: 15:33 2018/5/31
     */
    public static String toJson(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }

    /**
     * @param jsonStr
     * @param clazz
     * @param <T>
     * @return
     * @Description:Json字符串转对象
     * @Author: zhanghongqi1
     * @Date: 15:43 2018/5/31
     */
    public static <T> T toObject(String jsonStr, Class<T> clazz) {
        Gson gson = new Gson();
        return gson.fromJson(jsonStr, clazz);
    }

    public static Map toMap(String jsonStr) {
        Gson gson = new Gson();
        return gson.fromJson(jsonStr, new TypeToken<Map>() {
        }.getType());
    }

    public static <T> List<T> toArray(String jsonStr, Class<T> clazz) {
        Gson gson = new Gson();
        return gson.fromJson(jsonStr, new TypeToken<List<T>>() {
        }.getType());
    }
}
