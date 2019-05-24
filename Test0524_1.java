package com.bittech.Test;

import java.util.Stack;

/**
 * package:com.bittech.Test
 * Description:两个栈实现队列  pop()和push()方法
 * @date:2019/5/24
 * @Author:weiwei
 **/
public class Test0524_1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
    public static class Solution {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);
        }
        public int pop(){
            if(!stack2.empty()){
                return stack2.pop();
            }else if(!stack1.empty() && stack2.empty()){
                while(!stack1.empty()){
                    stack2.push(stack1.pop());
                }
                return stack2.pop();
            }
            return stack2.pop();
        }
    }
}
