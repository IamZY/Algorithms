package com.offer.Q1;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * @Author IamZY
 * @create 2020/2/9 15:47
 */
public class Solution {

    public boolean Find(int target, int[][] array) {
        if (array == null) {
            return false;
        }

        boolean isExist = false;

        int columns = array[0].length;  // 3
        int rows = array.length; // 3

        int row = 0;
        int column = 0;

        column = columns - 1; // 2
        while (row < rows && column >= 0) {

            if (array[row][column] == target) {
                isExist = true;
                break;
            } else if (array[row][column] > target) {
                --column;
            } else {
                ++row;
            }
        }

        return isExist;
    }


    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 4;
        arr[0][2] = 7;
        arr[1][0] = 2;
        arr[1][1] = 5;
        arr[1][2] = 8;
        arr[2][0] = 3;
        arr[2][1] = 6;
        arr[2][2] = 9;
        boolean res = new Solution().Find(3, arr);
        System.out.println(res);
    }


}
