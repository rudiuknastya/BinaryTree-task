package binaryTreeTask;

public class BinaryTree {
    TreeNode root = null;

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
}
