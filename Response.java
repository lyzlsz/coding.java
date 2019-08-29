package com.store.frank.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author zhangmingming  braveheart1115@163.com
 * @date 2019年07月25日 18:01
 * @Description: 封装response对象
 */
public class Response {

    //成功标识
    private static final int OK = 200;
    //失败标识
    private static final int FAILED = 500;

    private final Integer status;  // 状态码
    private final String message; // 提示信息
    private final Object data;  // 返回数据

    private Response(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
    /**
     * @author zhangmingming  braveheart1115@163.com
     * @date 2019/7/30 18:07
     * @Description: 成功的返回数据
     */
    public static Response Ok(Object data) {
        return new Response(OK, "", data);
    }
    /**
     * @author zhangmingming  braveheart1115@163.com
     * @date 2019/7/30 18:07
     * @Description:失败的返回数据
     */
    public static  Response Failed(String message) {
        return new Response(FAILED, message,null);
    }
    private static final Gson gson = new GsonBuilder().disableHtmlEscaping().create();

    @Override
    public String toString() {
        return gson.toJson(this);
    }
}