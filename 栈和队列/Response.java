package com.peixinchen;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class Response {
    private OutputStream os;
    public String stauts = "200 OK";
    private Map<String, String> headers = new HashMap<>();
    private byte[] buf = new byte[8192];
    private int contentLength = 0;

    public static Response build(OutputStream os) {
        Response response = new Response();
        response.os = os;
        response.setDefaultHeaders();

        return response;
    }

    private void setDefaultHeaders() {
        setHeader("Server", "JM/1.0.0");
        setHeader("Content-Type", "text/html");
    }

    public void setHeader(String server, String s) {
        headers.put(server, s);
    }

    public void println(Object o) throws UnsupportedEncodingException {
        write(o.toString().getBytes("UTF-8"));
    }

    private void write(byte[] bytes) {
        write(bytes, bytes.length);
    }

    public void write(byte[] b, int len) {
        System.arraycopy(b, 0, buf, contentLength, len);
        contentLength += len;
    }

    public void flush() throws IOException {
        setHeader("Content-Length", String.valueOf(contentLength));
        sendResponseLine();
        sendResponseHeaders();
        sendResponseBody();
    }

    private void sendResponseBody() throws IOException {
        os.write(buf);
    }

    private void sendResponseHeaders() throws IOException {
        for (Map.Entry<String, String> header : headers.entrySet()) {
            os.write((header.getKey() + ": " + header.getValue() + "\r\n").getBytes("UTF-8"));
        }
        os.write("\r\n".getBytes("UTF-8"));
    }

    private void sendResponseLine() throws IOException {
        // HTTP/1.0 200 OK\r\n
        os.write(("HTTP/1.0 " + stauts + "\r\n").getBytes("UTF-8"));
    }
}
