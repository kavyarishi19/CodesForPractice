package BinaryTree;

public class traversal {
    
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data , Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair{
        Node node;
        int state;
        
        Pair(Node node, int state){
            this.node = node;
            this.state = state; 
        }
    }

    void printInorder(Node node){
        if(node == null)
            return;
        
        printInorder(node.left);
        System.out.println(node.data + " ");
        printInorder(node.right);
    }

    void printPreorder(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }


    void printPostorder(Node node){
        if(node == null){
            return;
        }

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.println(node.data + " ");
    }



    public static void main(String[] args) throws Exception {
        
    }
}
