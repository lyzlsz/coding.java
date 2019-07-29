package Test0729;

/**
 * package:Test0729
 * Description:TODO
 * @date:2019/7/29
 * @Author:weiwei
 **/
public class testQueue {
    //链表实现队列
    private class Node{
        int value;
        Node next;
    }

    Node head;
    Node last;

    testQueue(){
        this.head = this.last = null;
    }
    /**
     * 入队列 数据插入到队尾
     * @param v
     */
    public void push(int v){
        Node node = new Node();
        node.value = v;
        node.next = null;
        if(this.head == null){
            this.head = this.last = node;
        }else{
            this.last.next = this.last=node;
        }
    }

    /**
     * 出队列
     */
    public int pop(){
        int v = this.head.value;
        this.head = this.head.next;
        if(this.head == null){
            this.last = null;
        }
        return v;
    }

    /**
     *
     * @return 返回队首元素
     */
    public int front(){
        if(this.head == null){
            throw new Error();
        }
        return this.head.value;

    }
    public int size(){
        return 0;

    }
    public boolean isEmpty(){
        return this.head == null;
    }
}
