package com.offer.Q28;

/*给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * @Author IamZY
 * @create 2020/4/24 17:21
 */


import com.sun.org.apache.bcel.internal.generic.NEW;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode h = head;

        ListNode res = new ListNode(0);

        ListNode r = res;

        while (h != null) {

            if (r.val != h.val) {
                r.next = new ListNode(h.val);
                r = r.next;
            }

            h = h.next;
        }

        if (head.val == 0) {
            return res;
        }

        return res.next;
    }
    
    public static void main(String[] args){

        ListNode h1 = new ListNode(0);
        h1.next = new ListNode(0);
        h1.next.next = new ListNode(0);

        ListNode n = new Solution().deleteDuplicates(h1);
    
        System.out.println(n);
        
    }

}
