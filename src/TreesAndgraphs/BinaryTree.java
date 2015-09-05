/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreesAndgraphs;

import java.util.Scanner;
/**
 *
 * @author pj
 */
public class BinaryTree {

    Node root = new Node(null);
    public void addNode(int value){
        Node parent = root;
        Node newNode = new Node(value);        
        if(root.value==null){            
            root.value = value;
        }
        else{
            while(true){
                if(value< (int)parent.value){                    
                    if(parent.left==null){
                        parent.left = newNode;
                        parent = newNode;
                        return;
                    }          
                    else
                        parent = parent.left;
                }
                else{
                    if(parent.right==null){
                        parent.right = newNode;
                        parent = newNode;
                        return;
                    }                        
                    else 
                        parent = parent.right;
                }
            }
        }
    }
    public void inOrderTraversal(Node focusNode){
        if(focusNode != null){
            inOrderTraversal(focusNode.left);
            System.out.print(focusNode.value + " --> ");
            inOrderTraversal(focusNode.right);
        }                                               
    }
    public void preOrderTraversal(Node focusNode){
        if(focusNode != null){
            System.out.print(focusNode.value + " --> ");
            preOrderTraversal(focusNode.left);
            preOrderTraversal(focusNode.right);
        }
    }    
    public void postOrderTraversal(Node focusNode){
        if(focusNode != null){           
            postOrderTraversal(focusNode.left);
            postOrderTraversal(focusNode.right);
            System.out.print(focusNode.value + " --> ");
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        System.out.println("Enter your choice");
        System.out.println("1. Add a node");
        System.out.println("2. Exit");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        while(input!=2){
            System.out.println("Enter the node value");
            tree.addNode(scan.nextInt());
            System.out.println("Enter your choice");
            System.out.println("1. Add a node");
            System.out.println("2. Exit");            
            input = scan.nextInt();
        }                        
        
        System.out.println("In Order traversal: LPR");
        tree.inOrderTraversal(tree.root);
        System.out.println("\nPre Order traversal: PLR");
        tree.preOrderTraversal(tree.root);
        System.out.println("\nPost Order traversal: LRP");
        tree.postOrderTraversal(tree.root);        
    }    
}    

class Node{
        Node left;
        Node right;
        Object value;
        
        public Node(Object value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
}
