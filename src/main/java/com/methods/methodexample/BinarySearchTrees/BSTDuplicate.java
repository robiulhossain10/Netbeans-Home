/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methods.methodexample.BinarySearchTrees;

/**
 *
 * @author ROBIUL
 */
public class BSTDuplicate {
    class Node{
        int key;
        int count = 1;
        Node left,right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
            }
        Node root;
        
        BSTDuplicate(){
        root = null;
    }
        
 
        
         // Recursive insert helper
        
        Node inserRec(Node root,int key){
            if (root == null) {
                root = new Node(key);
                return root;
            }
            if (key < root.key) {
                root.left = inserRec(root.left, key);
            } else if (key > root.key) {
                root.right = inserRec(root.right, key);
            }
            return root;
        }
        
               void insert(int key){
            root = inserRec(root, key);
        }
        
        void inOrderRec(Node root){
            if (root != null) {
                inOrderRec(root.left);
                System.out.print(root.key + " ");
                inOrderRec(root.right);
            }
        }
        
        void inOrder(){
            inOrderRec(root);
        }
        
        public static void main(String[] args) {
        BSTDuplicate bst = new BSTDuplicate();
        
        bst.insert(8);
        bst.insert(7);
        bst.insert(9);
        bst.insert(3);
        bst.insert(2);
        bst.insert(5);
        bst.insert(22);
        
        bst.inOrder();
        
        
    }
        
        
        
        

}
