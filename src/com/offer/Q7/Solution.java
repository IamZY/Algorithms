package com.offer.Q7;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 *
 * @Author IamZY
 * @create 2020/2/10 14:41
 */
public class Solution {

    public int JumpFloor(int target) {
        if (target <= 2) {
            return target;
        }

        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }

    public static void main(String[] args) {
        int i = new Solution().JumpFloor(3);
        System.out.println(i);
    }
}
