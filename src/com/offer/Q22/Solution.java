package com.offer.Q22;

import java.util.List;

/**
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * @Author IamZY
 * @create 2020/4/17 20:33
 */

//Definition for singly-linked list.

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }

            head = head.next;

        }

        if (l1 != null) {
            head.next = l1;
        }

        if (l2 != null) {
            head.next = l2;
        }

        // 判断是否遍历结束

        return dummy.next;

    }


    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l1_2 = new ListNode(2);
        ListNode l1_3 = new ListNode(4);

        l1.next = l1_2;
        l1_2.next = l1_3;

        ListNode l2 = new ListNode(1);
        ListNode l2_2 = new ListNode(3);
        ListNode l2_3 = new ListNode(4);

        l2.next = l2_2;
        l2_2.next = l2_3;


        ListNode n = new Solution().mergeTwoLists(l1, l2);

        System.out.println(n);

    }

}
