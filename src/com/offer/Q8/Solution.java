package com.offer.Q8;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 * @Author IamZY
 * @create 2020/2/10 20:24
 */
public class Solution {
    public int NumberOf1(int n) {

        char[] chars = Integer.toBinaryString(n).toCharArray();
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                num++;
            }
        }

        return num;

    }

    // 如果1 & 1 = 1 否则都为0
    public int NumberOf2(int n) {
        int num = 0, flag = 1;
        while (flag != 0) {
            System.out.println(n & flag);
            if ((n & flag) != 0) {
                num++;
            }
            flag <<= 1;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().NumberOf2(10));
    }
}
