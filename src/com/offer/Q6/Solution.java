package com.offer.Q6;


/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）n<=39
 *
 * @Author IamZY
 * @create 2020/2/10 14:29
 */
public class Solution {

    public int Fibonacci(int n) {

        // 0 1 1 2 3 5 8 13 21
        int[] arr = new int[40];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().Fibonacci(39));
    }
}
