package binaryTreeTask;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private TreeNode root = null;

    private TreeNode recursiveInsertion(TreeNode currentNode, char data){
        if(currentNode == null){
            return new TreeNode(data);
        }
        if(data < currentNode.data){
            currentNode.left = recursiveInsertion(currentNode.left, data);
        } else if(data > currentNode.data){
            currentNode.right = recursiveInsertion(currentNode.right, data);
        } else{
            return currentNode;
        }
        return currentNode;
    }
     public void insert (char data){
        root = recursiveInsertion(root, data);
     }

     public void bFS(){
         Queue<TreeNode> nodes = new LinkedList<>();
         nodes.add(root);
         while(!nodes.isEmpty()){
             TreeNode node = nodes.remove();
             System.out.print(node.data + " ");
             if(node.left != null){
                 nodes.add(node.left);
             }
             if(node.right != null){
                 nodes.add(node.right);
             }
         }

     }
}
