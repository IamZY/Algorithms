package com.offer.Q15;

import java.util.List;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 * @Author IamZY
 * @create 2020/2/22 19:54
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode res = null;
        ListNode temp = head;
        ListNode t = head;
        int size = 0;

        while (t != null) {
            size++;
            t = t.next;
        }

        int index = 1;
        while (temp != null) {
            if (index == size - k + 1) {
                res = temp;
                break;
            }
            temp = temp.next;
            index++;
        }

        return res;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        ListNode listNode = new Solution().FindKthToTail(n1, 1);
        
        System.out.println(listNode.val);

    }
}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}