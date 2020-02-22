package com.offer.Q11;

import java.util.ArrayList;

/**
 * @Author IamZY
 * @create 2020/2/15 20:34
 */
public class Solution {

    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array.length == 0) {
            return;
        }
        ArrayList<Integer> arr = new ArrayList();
        for (int i : array) {
            if (!arr.contains(i)) {
                arr.add(i);
            } else {
                arr.remove(new Integer(i));
            }
        }

        num1[0] = arr.get(0);
        num2[0] = arr.get(1);
    }

    public static void main(String[] args) {
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        new Solution().FindNumsAppearOnce(new int[]{1, 4, 3, 3, 2, 4}, num1, num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
