package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Tree{
        static int idx=-1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static int countOfNode(Node root){
        if(root==null){
            return 0;
        }
        int leftNode = countOfNode(root.left);
        int rightNode = countOfNode(root.right);
        return leftNode+rightNode+1;
    }
    public static int sumOfNode(Node root){
        if (root==null){
            return 0;
        }
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);
        return leftSum+rightSum+root.data;
    }
    public static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    // Approach - 1 -> Time Complexity O(n*2)
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heightOfTree(root.left)+heightOfTree(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }
    // Approach - 2 -> O(n) Time Complexity
    public static class TreeInfo{
        int ht;
        int diam;
        public TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo leftH = diameter2(root.left);
        TreeInfo rightH = diameter2(root.right);
        int myHeight = Math.max(leftH.ht,rightH.ht)+1;
        int diam1 = leftH.ht+rightH.ht+1;
        int diam2 = leftH.diam;
        int diam3 = rightH.diam;
        int myDiameter = Math.max(diam1,Math.max(diam2,diam3));
        return new TreeInfo(myHeight,myDiameter);
    }
    public static boolean isIdentical(Node root, Node subRoot){
        boolean response=false;
        if(subRoot==null){
            response = true;
        }
        return response;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6,-1,-1, 7, -1, -1};
        Node root = Tree.buildTree(nodes);
        System.out.print("Pre-Order Traversal : ");
        preOrder(root);
        System.out.print("\nIn-Order Traversal : ");
        inOrder(root);
        System.out.print("\nPost-Order Traversal : ");
        postOrder(root);
        System.out.print("\nCount Nodes : ");
        System.out.println(countOfNode(root));
        System.out.print("Sum of Nodes : ");
        System.out.println(sumOfNode(root));
        System.out.print("Height of Tree : ");
        System.out.println(heightOfTree(root));
        System.out.println("Level Order of Tree");
        levelOrder(root);
        System.out.print("Diameter of Tree(Approach-1) : ");
        System.out.println(diameter(root));
        System.out.print("Diameter of Tree(Approach-2) : ");
        System.out.println(diameter2(root).diam);
    }
}