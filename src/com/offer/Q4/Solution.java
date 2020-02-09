package com.offer.Q4;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * @Author IamZY
 * @create 2020/2/9 19:40
 */
public class Solution {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();


    // 先进先出
    public void push(int node) {
        stack1.push(node);
    }

    //
    public int pop() {
        int num = 0;

        if (!stack2.empty()) {
            num = stack2.pop();
        } else {
            while (!stack1.empty()) {
                int data = stack1.pop();
                stack2.push(data);
            }
            num = stack2.pop();
        }
        return num;
    }

    public static void main(String[] args) {

        Solution s1 = new Solution();
        s1.push(1);
        s1.push(2);
        s1.push(3);


        System.out.println(s1.pop());
        s1.push(5);
        System.out.println(s1.pop());
        s1.push(6);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());

        s1.push(7);
        System.out.println(s1.pop());
    }
}
