/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Alex
 */
public class UnivaluedBinaryTree {

    public static void main(String[] args) {

    }

    public static boolean isUnivalTree(TreeNode root) {
        if (root.left != null) {
            if (root.val == root.left.val) {
                if (root.right != null && root.right.val == root.val) {
                    return isUnivalTree(root.left) && isUnivalTree(root.right);
                } else if (root.right == null) {
                    return isUnivalTree(root.left);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else if (root.right != null) {
            if (root.right.val == root.val) {
                return isUnivalTree(root.right);

            } else {
                return false;
            }
        } else {
            return true;
        }

    }

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }
}
