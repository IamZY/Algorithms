package com.offer.Q13;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 * 保证base和exponent不同时为0
 *
 * @Author IamZY
 * @create 2020/2/22 19:03
 */
public class Solution {

    public double Power(double base, int exponent) {
        if (base == 0 && exponent == 0) {
            return 0;
        }


        int e = exponent > 0 ? exponent : -exponent;
        double result = 1.0d;
        for (int i = 0; i < e; i++) {
            result *= base;
        }
        return exponent > 0 ? result : 1 / result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().Power(2, -1));
    }
}
