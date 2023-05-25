package com.company.Learn_Java.algorithams;
    //// THIS CODE IS NOT WORKING WHAT IS THE PROBLEM I DONT KNOW SO REFER THE BinarySearchTreeOpe2.java FILE ////
class BTNode{
    int data;
    BTNode right, left;
    BTNode(int data ){
        this.data = data;
        right = left = null;
    }
}

public class BinarySearchTreeOpe {
    BTNode root,temp1,temp2;
    BTNode CreateNewNode(int data){
        BTNode nn = new BTNode(data);
        nn.right = nn.left =  null;
        return nn;
    }
    void inOrder(BTNode root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    BTNode insertNodeBST(BTNode root, int data){
        temp1 = CreateNewNode(data);
        if(root == null) {
            root = temp1;

        }else if(data < root.data ) {
            root.left = insertNodeBST(root.left,data);

        } else{
            root.right = insertNodeBST(root.right,data);
        }
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTreeOpe b = new BinarySearchTreeOpe();

        b.root = b.insertNodeBST(b.root,10);
       //b.inOrder(b.temp1);
        b.root = b.insertNodeBST(b.root,43);
        b.inOrder(b.temp1);

        b.root = b.insertNodeBST(b.root,143);
//        b.inOrder(b.temp1);
        b.root = b.insertNodeBST(b.root,4);
//        b.inOrder(b.root);

    }
}
