package Test0729;

/**
 * package:Test0729
 * Description:TODO
 * @date:2019/7/29
 * @Author:weiwei
 **/
public class testStack {
    //顺序表实现栈

    private int array[];
    int top;

    testStack(){
        this.array = new int[100];
    }
    /**
     * 压入一个数据
     * 压栈
     * @param v
     */
    public void push(int v){
        this.array[this.top++]=v;
    }

    /**
     * 弹栈,出栈
     * @return 栈顶元素
     */
    public int pop(){
        return this.array[--this.top];
    }

    /**
     *查看栈顶元素
     * @return 栈顶元素
     */
    public int peek(){
        return this.array[this.top-1];
    }
    public int size(){
        return this.top;
    }
    public boolean isEmpty(){
        return this.top == 0;
    }
}
