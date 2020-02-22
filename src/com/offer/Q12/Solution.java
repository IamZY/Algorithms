package com.offer.Q12;

/**
 * @Author IamZY
 * @create 2020/2/15 21:05
 */
public class Solution {

    public int GetNumberOfK(int[] array, int k) {

        if (array.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                while (i < array.length) {
                    if (array[i++] == k) {
                        count++;
                    } else {
                        break;
                    }
                }
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int i = new Solution().GetNumberOfK(new int[]{1, 2, 2, 2, 5, 5, 5, 5, 5, 8, 8, 9}, 10);
        System.out.println(i);
    }
}
