package binaryTreeTask;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert('h');
        binaryTree.insert('a');
        binaryTree.insert('k');
        binaryTree.insert('m');
        binaryTree.insert('c');
        binaryTree.bFS();
        System.out.println();
        binaryTree.dFS();

    }
}
