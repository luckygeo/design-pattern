package me.design.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: i
 * @createDate: 2021/7/14
 * @version: 1.0
 */
public class FlyweightFactory {
    private static final Map<String, Flyweight> map = new ConcurrentHashMap<>();

    public static Flyweight getFlyweight(String extrinsic){
        Flyweight flyweight = null;
        if (map.containsKey(extrinsic)) {
            System.out.print("已有 " + extrinsic + " 直接从池中取---->");
            flyweight = map.get(extrinsic);
        }else {
            flyweight = new ConcreteFlyweight(extrinsic);
            map.put(extrinsic, flyweight);
            System.out.print("创建 " + extrinsic + " 并从池中取出---->");
        }
        return flyweight;
    }
}
