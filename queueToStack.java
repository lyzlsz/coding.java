package Test0729;

import java.util.LinkedList;

/**
 * package:Test0729
 * Description:用队列实现栈
 * @date:2019/7/29
 * @Author:weiwei
 **/
public class queueToStack {
    private LinkedList<Integer> queue;
    public queueToStack(){
        this.queue = new LinkedList<>();
    }

    public void push(int x){
        this.queue.addLast(x);
    }
    public int pop(){
        int size = this.queue.size();
        for(int i =0;i<size-1;i++){
            int v = this.queue.get(0);
            this.queue.remove(0);
            this.queue.addLast(v);
        }
        int v = this.queue.get(0);
        this.queue.remove(0);
        return v;
    }
    public int top(){
        int size = this.queue.size();
        for(int i =0;i<size-1;i++){
            int v = this.queue.get(0);
            this.queue.remove(0);
            this.queue.addLast(v);
        }
        int v = this.queue.get(0);
        this.queue.remove(0);
        this.queue.addLast(v);
        return v;
    }
    public boolean empty(){
        return this.queue.size() == 0;
    }
}
