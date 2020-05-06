package com.offer.Q30;


import java.util.LinkedList;
import java.util.Queue;

/**给定一个二叉树，检查它是否是镜像对称的。
 *  - 它们的两个根结点具有相同的值
 *  - 每个树的右子树都与另一个树的左子树镜像对称。
 * @Author IamZY
 * @create 2020/5/6 15:06
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {

//    public boolean isSymmetric(TreeNode root) {
//        return isMirror(root, root);
//    }
//
//    public boolean isMirror(TreeNode t1, TreeNode t2) {
//        if (t1 == null && t2 == null) return true;
//        if (t1 == null || t2 == null) return false;
//        return (t1.val == t2.val)
//                && isMirror(t1.right, t2.left)
//                && isMirror(t1.left, t2.right);
//    }

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }


    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        root.left = left;
        root.right = right;

        left.left = new TreeNode(3);
        left.right = new TreeNode(4);

        right.left = new TreeNode(4);
        right.right = new TreeNode(3);

        boolean res = new Solution().isSymmetric(root);
        System.out.println(res);

    }
}
