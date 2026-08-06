package org.example.trees;

public class TreeBehaviours {

    public static boolean isIdentical(Node node1,Node node2) {
        if(node1 ==null && node2==null)
        {
            return true;
        }
        if(node1 ==null || node2==null)
        {
            return false;
        }

        if(node1.data != node2.data)
        {
            return false;
        }
        return (isIdentical(node1.left,node2.left) && isIdentical(node1.right,node2.right));
    }

    public static boolean isSymmetric(Node node1,Node node2) {

    //        1
    //       / \
    //      2   2
    //    / \  / \
    //    3  4 4   3
    // For symmetric tree, left subtree should match exactly to right subtree

        if(node1==null && node2==null )
        {
            return true;
        }
        if(node1==null || node2==null )
        {
            return false;
        }

        if(node1.data!= node2.data)
        {
            return false;
        }
        return (isSymmetric(node1.left,node2.right) && isSymmetric(node1.right,node2.left));

    }

    public static int countLeafNodes(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        if(node.left==null && node.right==null)
        {
            return 1;
        }
        return countLeafNodes(node.left)+ countLeafNodes(node.right);
    }

//    public static void printHeightOfEachNode(Node node) {
//        if(node==null)
//        {
//            return;
//        }
//
//        int left=printHeightOfEachNode(node.left);
//        int right=printHeightOfEachNode(node.right);
//
//        int height=1+Math.max(left,right);
//
//    }
}
