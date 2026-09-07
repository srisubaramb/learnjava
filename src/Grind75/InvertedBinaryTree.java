package Grind75;

import java.util.ArrayDeque;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
    }
}

public class InvertedBinaryTree {
    public void task1(){
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(8 );
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        TreeNode mirror = invertedTree(treeNode1);
        System.out.println("Mirror/inverted  tree");
        levelOrderTraverse(treeNode1);
    }
    public TreeNode invertedTree(TreeNode node) {
        if(node == null) return null;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        invertedTree(node.left);
        invertedTree(node.right);
        return node;
    }
    public void levelOrderTraverse(TreeNode root){
        Queue<TreeNode> nodes = new ArrayDeque<>();
        if(root == null) return;
        nodes.add(root);
        System.out.println();
        while (!nodes.isEmpty()){
            TreeNode currentNode = nodes.remove();
            System.out.print(currentNode.data + " ");
            if(currentNode.left != null) nodes.add(currentNode.left);
            if(currentNode.right != null) nodes.add(currentNode.right);
        }
        System.out.println();
    }
}
