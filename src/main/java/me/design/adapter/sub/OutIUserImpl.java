package me.design.adapter.sub;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2017/7/27
 */
public class OutIUserImpl implements OutIUser {
    @Override
    public Map<String, String> getUserInfo() {
        Map<String, String> map = new HashMap();
        map.put("name", "gao");
        map.put("mobile", "10000");
        return map;
    }
}
