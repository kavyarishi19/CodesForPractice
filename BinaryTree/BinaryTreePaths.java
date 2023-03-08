package BinaryTree;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BinaryTreePaths {
    void traverse(TreeNode root , String str , List<String> list){
        if(root!= null){
            str+= (root.val+"");
            if(root.left == null && root.right == null){
                list.add(str);
            }
            str+= "->"
            traverse(root.left, str, list);
            traverse(root.right, str, list);
        }
    }

    public List<String> binaryTreePaths(TreeNode root){
        List<String> list = new ArrayList<>();
        String str = "";
        traverse(root, "", list);
        return list;
    }

}
