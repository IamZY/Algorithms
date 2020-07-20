package com.offer.Q33;

import java.util.Arrays;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，
 * 其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 任何数和 000 做异或运算，结果仍然是原来的数，即 a⊕0=a
 * 任何数和其自身做异或运算，结果是 0，即 a⊕a=0
 * 异或运算满足交换律和结合律，即 a⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b
 *
 * @Author IamZY
 * @create 2020/7/18 9:42
 */
public class Solution {

    public int singleNumber(int[] nums) {

        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;

    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(new Solution().singleNumber(nums));
    }
}
