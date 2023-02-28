class Main{
    public static void main(String[] args){
        BinarySearchTree binaryTree = new BinarySearchTree();
        
        binaryTree.insert(1);
        binaryTree.insert(9);
        binaryTree.insert(3);
        binaryTree.insert(8);
        binaryTree.insert(0);
        binaryTree.insert(97);
        binaryTree.insert(32);
        binaryTree.insert(12);
        binaryTree.insert(764);
        binaryTree.insert(4);
        
        System.out.println("Pre Order:");
        binaryTree.preOrder(binaryTree.root);
        System.out.println("\n");
        
        System.out.println("In Order:");
        binaryTree.inOrder(binaryTree.root);
        System.out.println("\n");
        
        System.out.println("Post Order:");
        binaryTree.postOrder(binaryTree.root);
        System.out.println("\n");
        
        System.out.println("Level Order:");
        binaryTree.levelOrder();
        System.out.println("\n");
        
        System.out.println("Level Order:");
        binaryTree.levelOrder();
        
    }
}