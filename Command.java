package com;

import java.util.List;

/**
 * package:com
 * Description:TODO
 *
 * @date:2019/8/8 0008
 * @Author:weiwei
 **/
public interface Command {
    void setArgs(List<Object> args);

    void run();
}
