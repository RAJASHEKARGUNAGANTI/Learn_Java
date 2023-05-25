package com.company.Learn_Java.algorithams;

class Node{
    int data;
    Node left , right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class BinarySearchTreeOpe2 {
    Node root ,temp;
    Node createNode(int data){
        Node nn = new Node(data);
        nn.left = nn.right = null;
        return nn;
    }
    void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    Node insertNode(Node root, int data) {
        temp = createNode(data);
        if (root == null) root = temp;
        else if (data < root.data) root.left = insertNode(root.left,data);
        else root.right = insertNode(root.right,data);
        return root;
    }
    boolean searchNode(Node root, int data){
        if (root == null) return false;
        else if (data == root.data) return true;
        else if(data < root.data) return searchNode(root.left,data);
        return searchNode(root.right,data);
    }

    Node rightSubTreeMin(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }
    Node leftSubTreeMax(Node root){
        while (root.right != null){
            root = root.right;
        }
        return root;
    }

    Node deleteNode(Node root, int data){
        if(data < root.data) root.left = deleteNode(root.left,data);
        else if(data > root.data) root.right = deleteNode(root.right ,data);
        else{//  data == root.data
            // case 1
            if(root.left == null && root.right == null) return null;
            // case 2
            if(root.left == null) return root.right;
            else if(root.right == null) return  root.left;
            // case 3
             Node IS = rightSubTreeMin(root.right);
             root.data = IS.data;
             root.right = deleteNode(root.right,IS.data);

        }
        return root;
    }


    public static void main(String[] args) {
        BinarySearchTreeOpe2 b = new BinarySearchTreeOpe2();
        b.root = b.insertNode(b.root,10);
        b.root = b.insertNode(b.root,20);
        b.root = b.insertNode(b.root,2);
        b.root = b.insertNode(b.root,253);
        b.root = b.insertNode(b.root,212);
        b.inOrder(b.root);
        System.out.println(b.searchNode(b.root,10));
        System.out.println("-----------------------------------");
        b.root = b.deleteNode(b.root,20);
        b.inOrder(b.root);

    }
}
