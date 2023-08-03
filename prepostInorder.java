import java.util.LinkedList;
import java.util.Queue;
// import java.util.*;
public class prepostInorder{
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class Buildtree{
        public static void preOrder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if(root == null){
                return ;
            }

            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");

        }

        public static void levelOrder(Node root){
             if(root == null){
                return;
             }

             Queue<Node> q = new LinkedList<>();

             q.add(root);
             q.add(null);

             while(!q.isEmpty()){
                Node cur = q.remove();

                if(cur == null){
                       System.out.println();
                       if(q.isEmpty()){
                           break;
                       }else{
                        q.add(null);
                       }
                }
                else{
                    System.out.print(cur.data+" ");
                    if(cur.left!=null){
                        q.add(cur.left);
                    }
                  if(cur.right!=null){
                        q.add(cur.right);
                    }
                }
             }
        }

        

    }

    public static class BinarySearchTree{
        boolean isValidBST;
        int size;
        int max;
        int min;

        public  BinarySearchTree(boolean isValidBST, int size, int max, int min){
            this.isValidBST = isValidBST;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }

    public static BinarySearchTree isBST(Node root){
           if(root == null){
              new BinarySearchTree(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
           }

           BinarySearchTree leftNode = isBST(root.left);
           BinarySearchTree rightNode = isBST(root.right);
    }
    public static void main(String args[]){
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        head.left.left.left = new Node(8);
        head.left.left.right = new Node(9);
        head.left.right.left = new Node(10);
        head.left.right.right = new Node(11);              
        head.right.left.left = new Node(12);
        
        
        
        Buildtree tree = new Buildtree();
        tree.preOrder(head);
        System.out.println();
        tree.inOrder(head);
        System.out.println();
        tree.postOrder(head);
        System.out.println();
        tree.levelOrder(head);
    }
    
}
