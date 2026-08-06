package org.example.trees;

import java.util.*;

import static org.example.trees.TreeBehaviours.*;

public class Node {
    int data;
    Node left;
    Node right;

    Node(int value){
        this.data=value;
        this.left=null;
        this.right=null;
    }
}
class Trees{

    static Queue<Node> que=new LinkedList<>();
    public static void main(String[] args) {
    //      1
    //     / \
    //    2   3
    //   /\   /\
    //  4 5  6 7
        Node node=new Node(1);

        node.left=new Node(2);
        node.right=new Node(3);

        node.left.left=new Node(4);
        node.left.right=new Node(5);

        node.right.left=new Node(6);
        node.right.right=new Node(7);




        //postOrder(node);
        System.out.println("totalnodes:"+countNodes(node));
        System.out.println("Height:"+heightoftree(node));
        levelOrderTraversal(node);
        System.out.println(" Max: "+findMax(node));
        System.out.println(" Searching for 6 "+search(node,6));
        //System.out.println("After tree is inverted");
        //invertTree(node);
        //levelOrderTraversal(node);
        System.out.println(" pathsum is :"+pathSum(node,12));
        System.out.println(isIdentical(node,node));
        System.out.println("IsSymmetric:"+isSymmetric(node.left,node.right));
        System.out.println("Count Leaf Nodes: "+ countLeafNodes(node));

    }
    //Preorder = Root → Left → Right
    public static void preorder(Node root){
    if(root==null){
        return;
    }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    //Left → Root → Right
    public static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    //Left → Right → Root
    public static void postOrder(Node root){
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);

    }
    public static int countNodes(Node root)
    {   if(root==null)
    {
        return 0;
    }
      return 1+ countNodes(root.left) + countNodes(root.right);
    }

    public static int heightoftree(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=1+heightoftree(root.left);
        int right=1+heightoftree(root.right);
        return Math.max(left,right);
    }

    public static void levelOrderTraversal(Node root)
    {
        if(root==null)
        {
            return;
        }
        que.add(root);
        //Level Order== BFS (Breadth First)
        while(!que.isEmpty())
        {
            Node curr=que.poll();
            System.out.print(" | "+curr.data);
            if(curr.left!=null && curr.right!=null) {
                que.add(curr.left);
                que.add(curr.right);
            }
        }
    }

    public static int findMax(Node root)
    {
        //findmax value
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        int left=findMax(root.left);
        int right=findMax(root.right);

        return Math.max(root.data,Math.max(left,right));
    }
    public static boolean search(Node root,int k)
    {
        //search for k and return true
        if(root==null)
        {
            return false;
        }
        else if(root.data==k)
        {
            return true;
        }
        if(search(root.left, k)==true || search(root.right, k)==true)
        {
            return true;
        }
        return false;
    }
    public static Node invertTree(Node root){
        if(root==null)
        {
            return root;
        }
        Node left=invertTree(root.left);
        Node right=invertTree(root.right);

        root.left=right;
        root.right=left;

        return root;
    }

    public static boolean pathSum(Node root,int target)
    {
        //basecase-1
        if(root==null)
        {
            return false;
        }
        //find out remaining
        int remaining=target - root.data;

        //basecase-2 is if we have reached to a leaf and remaining is 0
        if(root.left==null || root.right==null)
        {
            return remaining==0;
        }

        return pathSum(root.left,remaining) || pathSum(root.right,remaining);
    }
}
