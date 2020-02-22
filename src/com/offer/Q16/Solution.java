package com.offer.Q16;

import java.util.List;
import java.util.Stack;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 *
 * @Author IamZY
 * @create 2020/2/22 20:29
 */
public class Solution {

    public ListNode ReverseList(ListNode head) {
        // 判断链表为空或长度为1的情况
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null; // 当前节点的前一个节点
        ListNode next = null; // 当前节点的下一个节点
        while (head != null) {
            next = head.next; // 记录当前节点的下一个节点位置；
            head.next = pre; // 让当前节点指向前一个节点位置，完成反转
            pre = head; // pre 往右走
            head = next;// 当前节点往右继续走
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        ListNode listNode = new Solution().ReverseList(n1);

    }

}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
