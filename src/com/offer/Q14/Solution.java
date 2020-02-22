package com.offer.Q14;

import java.util.Arrays;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 * @Author IamZY
 * @create 2020/2/22 19:14
 */
public class Solution {

    public void reOrderArray(int[] array) {
        if (array.length == 0) {
            return;
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {// 偶数
                int index = i + 1; // 2
                while (index < array.length) {
                    if (array[index] % 2 != 0) {
                        // 插入
                        int temp = array[index]; // 保留需要插入的数字 3
                        for (int j = index - 1; j >= i; j--) {
                            array[j + 1] = array[j];
                        }
                        array[i] = temp;
                        break;
                    }
                    index++;
                }
            } else { //
                continue;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 5, 4, 3};
        new Solution().reOrderArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
