package com.peixinchen;

import java.io.IOException;

public interface Controller {
    void doGet(Request request, Response response) throws IOException;
}
