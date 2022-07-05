package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;


//    Constructor to initialize Binary Tree
    public BinaryTreeLL(){
        this.root = null;
    }


//    Pre Order traversal  ( visiting root node then -->  left subtree then --> right subtree )

    public void preOrder(BinaryNode node){
        if(node == null)
            return;
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }


//    In Order traversal  ( visiting left subtree then -->  root node then --> right subtree )

    public void inOrder(BinaryNode node){
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }

//    Post Order traversal  ( visiting left subtree then -->  right subtree then --> root node  )

    public void postOrder(BinaryNode node){
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }

//    Level Order Traversal ( Traversing level by level from left to right )

    public void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value+" ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }


//    Inserting in Binary Tree ( First empty Place level wise )

    public void insert(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if(root == null){
            root = newNode;
            System.out.println("Inserted at the root position");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.left == null){
                presentNode.left = newNode;
                System.out.println("Successfully Inserted");
                return;
            } else if(presentNode.right==null){
                presentNode.right = newNode;
                System.out.println("Successfully Inserted");
                return;
            }else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

}
