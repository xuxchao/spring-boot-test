package springboot.demo.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @describe:  FastJson工具类
 * @author: luoshixin
 * @create: 2018/9/19 下午2:44
 **/

public class FastJsonUtil {

    /**
     * json字符串转map集合
     * @param jsonStr
     * @return
     */
    public static HashMap<String, String> json2Map(String jsonStr){
        return JSON.parseObject(jsonStr, new HashMap<String, String>().getClass());
    }

    /**
     * map转json字符串
     * @param map
     * @return
     */
    public static String map2Json(Map<String, String> map){
        String jsonStr = JSON.toJSONString(map);
        return jsonStr;
    }


    public static <T> T parseObject(String text, Class<T> clazz) {
        return JSON.parseObject(text, clazz);
    }


    /**
     * json字符串转换成对象
     * @param jsonString
     * @param cls
     * @return
     */
    public static <T> T json2Bean(String jsonString, Class<T> cls){
        T t = null;
        try {
            t = JSON.parseObject(jsonString,cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * 对象转换成json字符串
     * @param obj
     * @return
     */
    public static String bean2Json(Object obj){
        return JSON.toJSONString(obj, SerializerFeature.WriteMapNullValue);
    }

    /**
     * json字符串转换成List集合
     * (需要实体类)
     * @param jsonString
     * @return
     */
    public static <T> List<T> json2List(String jsonString, Class cls){
        List<T> list = null;
        try {
            list = JSON.parseArray(jsonString, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * json字符串转换成ArrayList集合
     * (需要实体类)
     * @param jsonString
     * @return
     */
    public static <T> ArrayList<T> json2ArrayList(String jsonString, Class cls){
        ArrayList<T> list = null;
        try {
            list = (ArrayList<T>) JSON.parseArray(jsonString, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * List集合转换成json字符串
     * @param obj
     * @return
     */
    public static String list2Json(Object obj){
        return JSONArray.toJSONString(obj, true);
    }

    /**
     * json转List
     * (不需要实体类)
     * @param jsonStr
     * @return
     */
    public static JSONArray json2List(String jsonStr){
        return JSON.parseArray(jsonStr);
    }
}