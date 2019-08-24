package com.peixinchen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Request {
    private String method;
    private String url;
    private String version;
    private Map<String, String> headers = new HashMap<>();

    public static Request parse(InputStream is) throws IOException {
        Request request = new Request();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        // 解析请求行
        parseRequestLine(reader, request);
        // 解析请求头
        parseRequestHeaders(reader, request);
        // 解析可能存在的请求体

        return request;
    }

    private static void parseRequestHeaders(BufferedReader reader, Request request) throws IOException {
        String line;
        while ((line = reader.readLine()) != null && line.length() != 0) {
            String[] kv = line.split(":");
            String key = kv[0].trim();
            String value = kv[1].trim();
            request.headers.put(key, value);
        }
    }

    private static void parseRequestLine(BufferedReader reader, Request request) throws IOException {
        String line = reader.readLine();
        if (line == null) {
            throw new IOException("读到 EOF");
        }

        String[] fragments = line.split(" ");

        // 解析方法
        request.setMethod(fragments[0]);
        // 解析 URL
        request.setUrl(fragments[1]);
        // 解析版本号
        request.setVersion(fragments[2]);
    }

    private void setUrl(String fragment) {
        // index?name=peixinchen&times=3
        //      ------------------------
        //      QueryString
        // 先去判断 URL 中有没有 QueryString
        String[] group = fragment.split("\\?");
        url = group[0];
        if (group.length > 1) {
            setRequestParams(group[1]);
        }
    }

    private void setRequestParams(String s) {
    }

    private void setVersion(String fragment) {
        version = fragment;
    }

    private void setMethod(String fragment) {
        method = fragment;
    }

    public String getUrl() {
        return url;
    }
}
