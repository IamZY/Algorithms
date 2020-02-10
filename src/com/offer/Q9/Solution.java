package com.offer.Q9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 *
 * @Author IamZY
 * @create 2020/2/10 20:47
 */
public class Solution {

    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)) {
                int num = 0;
                map.put(c, ++num);
            } else {
                int value = map.get(c);
                map.put(c, ++value);
            }
        }

        String s = "";
        for(Map.Entry e : map.entrySet()) {
            if ((int)e.getValue() == 1) {
                s = e.getKey().toString();
                break;
            }
        }

        return str.indexOf(s);
    }


    public static void main(String[] args) {

        System.out.println(new Solution().FirstNotRepeatingChar("aaaaaa"));

    }

}
