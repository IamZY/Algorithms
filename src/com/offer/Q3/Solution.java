package com.offer.Q3;

import java.lang.reflect.Array;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *
 * @Author IamZY
 * @create 2020/2/9 16:51
 */
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList arr = new ArrayList();
        Stack stack = new Stack();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }


        int count = stack.size();
        for(int i = 0;i < count;i++) {
            arr.add(stack.pop());
        }


        return arr;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        ListNode node = node1;

//        while (node.next != null) {
//            System.out.println(node.val);
//            node = node.next;
//        }
        ArrayList arrayList = new ArrayList();
        System.out.println(new Solution().printListFromTailToHead(node).toString());

    }
}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

}