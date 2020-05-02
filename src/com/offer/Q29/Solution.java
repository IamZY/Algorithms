package com.offer.Q29;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

/**
 * @Author IamZY
 * @create 2020/5/2 10:18
 */

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {

    private ArrayList arr = new ArrayList();

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;

        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


    public static void main(String[] args) {
    }
}