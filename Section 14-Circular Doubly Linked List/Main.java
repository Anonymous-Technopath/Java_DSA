class Main{
    public static void main(String[] args){
        CircularDoublyLinkedList cdll= new CircularDoublyLinkedList();
        cdll.createCDLL(5);
        System.out.println(cdll.head.value);
        cdll.insertNode(12,0);
        cdll.insertNode(4,2);
        cdll.insertNode(9,3);
        cdll.insertNode(7,1);

        System.out.println("Traversing");
        cdll.traverseCDLL();
        cdll.deleteCDLL();
        System.out.println("Reverse Traversing");
        cdll.reverseTraverseCDLL();
        
        cdll.searchNode(9);
        
    }
}