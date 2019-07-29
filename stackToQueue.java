package Test0729;

import java.util.Stack;

/**
 * package:Test0729
 * Description:两个栈实现队列
 *
 * @date:2019/7/29
 * @Author:weiwei
 **/
public class stackToQueue {
    Stack<Integer> in;
    Stack<Integer> out;

    public stackToQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                int v = in.pop();
                out.push(v);
            }
        }
        int v = out.pop();
        return v;
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                int v = in.pop();
                out.push(v);
            }
        }
        int v = out.peek();
        return v;
    }
    public boolean empty(){
        return in.isEmpty() && out.isEmpty();
    }
}
