package com.offer.Q18;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 *     左括号必须用相同类型的右括号闭合。
 *     左括号必须以正确的顺序闭合。
 *
 * 注意空字符串可被认为是有效字符串。
 */
public class Solution {

    public boolean isValid(String s) {
        List<Character> left = Arrays.asList('(','{','[');
        List<Character> right = Arrays.asList(')','}',']');

        boolean b = true;
        Stack stack = new Stack();

        if (s == "") {
            return b;
        }

        char[] chars = s.toCharArray();

        for(char c : chars) {

            if (stack.isEmpty()) {
                if (right.contains(c)) {
                    b = false;
                    break;
                } else {
                    stack.push(c);
                }
            } else {

                if (left.contains(c)) {
                    stack.push(c);
                } else {
                    char f = (char) stack.pop();
                    int index;
                    if (right.indexOf(c) != left.indexOf(f)) {
                        b = false;
                        break;
                    } else {
                        continue;
                    }

                }
            }

        }


        if (!stack.isEmpty()) {
            return false;
        }


        return b;
    }

    public static void main(String[] args) {
        new Solution().isValid("{}{}");
    }
}
