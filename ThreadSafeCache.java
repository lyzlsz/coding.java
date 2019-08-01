package Test0801;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * package:Test0801
 * Description:TODO
 *
 * @date:2019/8/1 0001
 * @Author:weiwei
 **/
public class ThreadSafeCache {
    private Map<String,String> map = new HashMap<>();
    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    public String getValue(String key){
        reentrantReadWriteLock.readLock();
        return map.get(key);
    }
    public void setValue(String key,String value){
        reentrantReadWriteLock.writeLock();
        map.put(key,value);
    }
}
