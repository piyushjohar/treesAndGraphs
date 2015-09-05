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
public class checkBalanced {
        static int min =0;
        static int max =0;
    public static void main(String[] args){
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
        min = minDepth(tree.root);
        max= maxDepth(tree.root);
        System.out.println("Min Depth: " + min);
        System.out.println("Max Depth: " + max);
        if(max-min<=1)
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
    public static int minDepth(Node parent){
        if(parent.left==null || parent.right == null)
            return min;
        else{
            min= 1+ Math.min(minDepth(parent.left), minDepth(parent.right));
        }
        return min;            
    }
    public static int maxDepth(Node parent){
         if(parent==null)
            return max;
         else if(parent.left!=null || parent.right!=null){
            max= 1+ Math.max(maxDepth(parent.left), maxDepth(parent.right));
        }
        return max;            
    }
}
