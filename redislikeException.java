package com;

/**
 * package:com
 * Description:TODO
 *
 * @date:2019/8/2 0002
 * @Author:weiwei
 **/
public class redislikeException extends Exception {
    public redislikeException() {
    }

    public redislikeException(String message) {
        super(message);
    }

    public redislikeException(String message, Throwable cause) {
        super(message, cause);
    }

    public redislikeException(Throwable cause) {
        super(cause);
    }

    public redislikeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
