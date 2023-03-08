package BinaryTree;

import javax.swing.tree.TreeNode;

public class serialise {

        public static void serializeHelper(TreeNode root , StringBuilder sb){
            if(root == null){
                sb.append("null,");
                return;
            }
            
            sb.append(root.val +",");
            serializeHelper(root.left, sb);
            serializeHelper(root.right, sb);
        }
        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            serializeHelper(root,sb);
            return sb.toString();
            
        }
    
        public TreeNode deserialize(String data) {
            
        }         
}
