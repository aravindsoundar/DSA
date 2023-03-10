import java.util.*;

class Node{
    int key;
    Node left,right;
   
    public Node(int item){
        key=item;
        left = null;
        right = null;
    }
}

class BinaryTree{
    Node root;
    BinaryTree(){
        root=null;
    }
    void delete(int key){
        root=deleteRec(root,key);
       
    }
    Node deleteRec(Node root,int key){
        if(root==null){
            return root;
        }
        if(key<root.key){
            root.left=deleteRec(root.left,key);
           
        }
        else if(key>root.key){
            root.right=deleteRec(root.right,key);
        }
       return root;
    }
   
    boolean search(int key){
        //System.out.println("check1");
        return searchRec(root, key);
       
    }
    boolean searchRec(Node root,int key){
        if(root==null){
            //System.out.println("c");
            return false;
        }
        if(root.key==key) {
            //System.out.println("c1");
            return true;}
        if(root.key>key) {
            return searchRec(root.left,key);}
        else{
            return searchRec(root.right,key);    }
    }
   
    void insert(int key){
        root=insertRec(root,key);
    }
   
    Node insertRec(Node root, int key){
        if (root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key){
            root.left = insertRec(root.left,key);
           
        }
        else if(key>root.key){
            root.right = insertRec(root.right,key);
        }
        return root;
    }
    void inorder(){
        inorderRec(root);
    }
    void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.key+" ");
            inorderRec(root.right);
        }
    }
    void preorder(){
        preorderRec(root);
   
    }
    void preorderRec(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    void postorder(){
        postorderRec(root);
   
    }
    void postorderRec(Node root){
        if(root!=null){
           
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key+" ");
        }
    }
   
}
public class treeTraversal{
    public static void main(String[] args){
    BinaryTree bst = new BinaryTree();
    bst.insert(50);
    bst.insert(30);
    bst.insert(20);
    bst.insert(40);
    bst.insert(70);
    bst.insert(60);
    bst.insert(80);
    System.out.println("inorder");
    bst.inorder();
    System.out.println(" ");
    System.out.println("preorder");
    bst.preorder();
    System.out.println(" ");
    System.out.println("postorder");
    bst.postorder();
    boolean x=bst.search(80);
    System.out.println(x);
    }
}