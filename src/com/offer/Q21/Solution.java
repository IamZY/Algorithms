package com.offer.Q21;

import java.util.Arrays;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Solution {

    public int MoreThanHalfNum_Solution(int[] array) {
        if (null == array || array.length == 0) {
            return 0;
        }

        if (array.length == 1) {
            return array[0];
        }

        int half = array.length / 2;
        Arrays.sort(array);

        int i = 0;
        int j = 0;
        int min = 0;
        int index = 0;
        while (j < array.length - 1) {
            j = i + 1;
            while (true) {
                if (array[i] != array[j]) {
                    ++index;
                    break;
                }
                i++;
                j++;
                index++;
                if (j >= array.length) {
                    ++index;
                    break;
                }
            }

            if (index > half && index >= min) {
                min = array[i];
            }

            i = j;
            index = 0;
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().MoreThanHalfNum_Solution(new int[]{1}));
    }
}
