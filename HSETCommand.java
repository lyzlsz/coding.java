package com.Commands;

import com.Command;
import com.Database;
import com.Protocol;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/**
 * package:com.Commands
 * Description:TODO
 *
 * @date:2019/8/9 0009
 * @Author:weiwei
 **/
public class HSETCommand implements Command {
    private List<Object> args;

    @Override
    public void setArgs(List<Object> args) {
        this.args = args;
    }

    @Override
    public void run(OutputStream os) throws IOException {
        String key = new String((byte[]) args.get(0));
        String filed = new String((byte[]) args.get(0));
        String value = new String((byte[]) args.get(0));
        Map<String, String> hash = Database.getHashes(key);
        boolean isUpdate = hash.containsKey(filed);
        hash.put(filed, value);
        if (isUpdate) {
            Protocol.writeInteger(os, 0);
        } else {
            Protocol.writeInteger(os, 1);
        }
    }
}
