import java.util.Queue;
import java.util.LinkedList;
public class BinaryTreeLL{
    BinaryNode root;
    
    public BinaryTreeLL(){
        this.root=null;
    }
    
    //PreOrder Traversal
    void preOrder(BinaryNode node){
       if(node==null){
           return;
       }
       System.out.print(node.value+" ");
       preOrder(node.left);
       preOrder(node.right);
    }
    
    //InOrder Traversal
    void inOrder(BinaryNode node){
       if(node==null){
           return;
       }
       inOrder(node.left);
       System.out.print(node.value+" ");
       inOrder(node.right);
    }
    
    //PostOrder Traversal
    void postOrder(BinaryNode node){
       if(node==null){
           return;
       }
       postOrder(node.left);
       postOrder(node.right);
       System.out.print(node.value+" ");
    }
    
    //LevelOrder Traversal
    void levelOrder(){
       Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
       queue.add(root);
       while(!queue.isEmpty()){
           BinaryNode presentNode=queue.remove();
           System.out.print(presentNode.value+" ");
           if(presentNode.left!=null){
               queue.add(presentNode.left);
           }
           if(presentNode.right!=null){
               queue.add(presentNode.right);
           }
       }
    }
    
    //search
    void search(String value){
       Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
       queue.add(root);
       while(!queue.isEmpty()){
           BinaryNode presentNode=queue.remove();
           if(presentNode.value.equals(value)){
               System.out.println("Value found");
               return;
           }
           if(presentNode.left!=null){
               queue.add(presentNode.left);
           }
           if(presentNode.right!=null){
               queue.add(presentNode.right);
           }
       }
       System.out.println("Value not found");
    }    
    
    //Insertion
    void insert(String value){
        BinaryNode newNode= new BinaryNode();
        newNode.value=value;
        if(root==null){
            root=newNode;
            System.out.println("Successfully inserted at root node");
            return;
        }
       Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
       queue.add(root);
       while(!queue.isEmpty()){
           BinaryNode presentNode=queue.remove();
           if(presentNode.left==null){
               presentNode.left=newNode;
               System.out.println("Successfully inserted");
               break;
           }
           else if(presentNode.right==null){
               presentNode.right=newNode;
               System.out.println("Successfully inserted");
               break;
           }else{
               queue.add(presentNode.left);
               queue.add(presentNode.right);
           }
       }
    }
    
    //Get deepest node
    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode=null;
        while(!queue.isEmpty()){
            presentNode=queue.remove();
           if(presentNode.left!=null){
               queue.add(presentNode.left);
           }
           if(presentNode.right!=null){
               queue.add(presentNode.right);
           }
        }
        return presentNode;
    }
    
    //Delete Deepest Node
    public void deleteDeepestNode(){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode,presentNode=null;
        while(!queue.isEmpty()){
           previousNode=presentNode;
           presentNode=queue.remove();
           if(presentNode.left==null){
               previousNode.right=null;
               return;
           }
           else if(presentNode.right==null){
               presentNode.left=null;
               return;
           }
           queue.add(presentNode.left);
           queue.add(presentNode.right);           
       }
    }
    
    //Delete Given Node
    void deleteNode(String value){
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            if(presentNode.value.equals(value)){
                presentNode.value=getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("Node Deleted");
                return;
            }
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
        System.out.println("Node does not exist");        
    }
    
    //Delete binary tree
    void deleteBT(){
        root=null;
        System.out.println("Binary Tree deleted");
    }
}