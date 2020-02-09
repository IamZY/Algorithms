package com.ntuzy.day16;


import java.util.HashMap;
import java.util.Map;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class Solution {


    public String longestCommonPrefix(String[] strs) {
        String longestStr = "";

        if (strs.length == 0 || strs == null) {
            return longestStr;
        }

        if (strs.length == 1) {
            longestStr = strs[0];
            return longestStr;
        }


        int max = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > max) {
                max = strs[i].length();
            }
        } //for

        int maxNum = 1;
        for (int i = 0; i < max; i++) {
            Map<String, Integer> map = new HashMap<>();
            for (String str : strs) {
                if (str.length() < i + 1) {
                    continue;
                }
                String prefix = str.substring(0, i + 1);
                if (!map.containsKey(prefix)) {
                    map.put(prefix, 1);
                } else {
                    Integer value = map.get(prefix);
                    value++;
                    map.put(prefix, value);
                }
            }

            // 记录相同前缀最大值
            for (Map.Entry<String, Integer> m : map.entrySet()) {
                String prefix = m.getKey();
                int value = m.getValue();
                if (maxNum <= value) {
                    maxNum = value;
                    longestStr = prefix;
                }
            }

        }

        if (maxNum == 1) {
            longestStr = "";
        }


        return longestStr;
    }


    /**
     * 输入: ["flower","flow","flight"]
     * 输出: "fl"
     *
     * @param args
     */
    public static void main(String[] args) {
//        String[] strs = new String[]{"flower", "flow", "flight"};
//        String[] strs = new String[]{"dog", "racecar", "car"};
        String[] strs = new String[]{"a", "a", "b"};
//        String[] strs = new String[]{"c", "c"};

        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(strs);
        System.out.println(s);
    }

}
