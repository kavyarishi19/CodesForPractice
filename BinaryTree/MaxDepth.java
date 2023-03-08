package BinaryTree;

import javax.swing.tree.TreeNode;

public class MaxDepth {
    public int maxDepth(TreeNode root){
        if(root == null) return;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + Math.max(lh, rh);
    }
}

class Solution{
    public int minDepth(TreeNode root){
        if(root == null) return 0;

        if(root.left == null){
            return 1+ minDepth(root.right);
        }else if(root.right == null){
            return 1+ minDepth(root.left);
        }

        return 1+Math.min(minDepth(root.left), minDepth(root.right));
    }
}