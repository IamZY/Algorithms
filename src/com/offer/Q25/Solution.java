package com.offer.Q25;


import java.util.Arrays;

/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 * @Author IamZY
 * @create 2020/4/21 9:18
 */
public class Solution {

    public String addBinary(String a, String b) {

        int aL = a.length();
        int bL = b.length();

        int maxL = a.length() > b.length() ? a.length() : b.length();

        int index = 0;
        if (a.length() > b.length()) {
            while (index < maxL - bL) {
                b = "0" + b;
                index++;
            }
        } else if (a.length() < b.length()){
            while (index < maxL - aL) {
                a = "0" + a;
                index++;
            }
        }




//         System.out.println("a = " + a + ",b = " + b);

        int i = 0;
        int end = 0;
        // end 移动到最后一位
        while (i < maxL) {
            i++;
            end++;
        }

        int flag = 0;
        String res = "";
        while (end > 0) {

            int x = Integer.parseInt(new Character(a.charAt(end - 1)).toString());
            int y = Integer.parseInt(new Character(b.charAt(end - 1)).toString());

            if (x + y + flag == 0) {
                res = 0 + res;
                flag = 0;
            } else if (x + y + flag == 1) {
                res = 1 + res;
                flag = 0;
            } else if (x + y + flag == 2) {
                res = 0 + res;
                flag = 1;
            } else {
                res = 1 + res;
                flag = 1;
            }

            end--;
        }


        if (flag != 0) {
            return "1" + res;
        } else {
            return res;
        }
    }


    public static void main(String[] args) {
        String s = new Solution().addBinary("100", "110010");
        System.out.println(s);
    }

}
