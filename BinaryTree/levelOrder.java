package BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import javax.naming.spi.StateFactory;
import javax.swing.tree.TreeNode;

import BinaryTree.traversal.Node;

public class levelOrder {
    public static void levelOrder(Node node){
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);

        while(mq.size() > 0){
            int count = mq.size();
            for(int i=0;i< count ; i++){
                node = mq.remove();
                System.out.println(node.data + " ");

                if(node.left != null){
                    mq.add(node.left);
                }
                if(node.right != null){
                    mq.add(node.right);
                }
            }
            System.out.println();
        }
    }


    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new LinkedList<>();
            if(root == null){
                return ans;
            }
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> level = new LinkedList<>();
                for(int i = 0; i < size; i++){
                    TreeNode node = q.poll();
                    if(node.left != null){
                        q.add(node.left);
                    }
                    if(node.right != null){
                        q.add(node.right);
                    }
                    level.add(node.val);
                }
                ans.add(level);
            }
            return ans;
        }
    }
    }
