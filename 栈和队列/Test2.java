package Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author:weiwei
 * Creat:2019/19
 **/
//stack栈
    //Queue队列
public class Test2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        //数据取完返回null
        System.out.println(queue.poll());
    }
}
