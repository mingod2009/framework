package com.nie.framework.bean;

import com.nie.framework.util.CastUtil;

import java.util.Map;

/**
 * Created by sam on 2017/10/23.
 */
public class Param {
    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }
    public long getLong(String name) {
        return CastUtil.castInt(paramMap.get(name));
    }
    public Map<String, Object> getMap() {
        return paramMap;
    }
}
