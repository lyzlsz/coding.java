package Stack;

import java.util.Stack;

/**
 * Author:weiwei
 * Creat:2019/1/9
 **/
//stack栈
    //出入栈操作
public class Test1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("Java");   //入栈
        stack.push("PHP");
        stack.push("Python");
        System.out.println(stack.peek());  //观察栈顶元素
        System.out.println(stack.pop());   //出栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());  //数据取完返回EmptyStackException(空栈)
    }

}
