package com.offer.Q2;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * @Author IamZY
 * @create 2020/2/9 16:42
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return "";
        }
        return str.toString().replace(" ", "%20");
    }

    public static void main(String[] args) {
        System.out.println(new Solution().replaceSpace(new StringBuffer("We Are Happy")));
    }
}
