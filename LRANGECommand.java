package com;

import java.time.Period;
import java.util.List;

/**
 * package:com
 * Description:TODO
 *
 * @date:2019/8/8 0008
 * @Author:weiwei
 **/
public class LRANGECommand implements Command {
    private List<Object> args;
    @Override
    public void setArgs(List<Object> args) {
        this.args = args;
    }

    @Override
    public void run() {

    }
}
