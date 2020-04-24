package com.offer.Q27;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * @Author IamZY
 * @create 2020/4/24 11:02
 */
public class Solution {

    public int climbStairs(int n) {

        if (n <= 0) return -1;

        if (n == 1 || n == 2) {
            return n;
        } else {
//            return climbStairs(n - 1) + climbStairs(n - 2);
            int one = 1;
            int two = 2;
            int res = 0;
            for (int i = 2; i < n; i++) {
                res = one + two;
                one = two;
                two = res;
            }
            return res;
        }


    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(45));
    }
}
