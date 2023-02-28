public class Main{
    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(5);
        System.out.println(dll.head.value);
        dll.insertDLL(2,1);
        dll.insertDLL(4,3);
        dll.insertDLL(6,2);
        dll.insertDLL(9,3);
        
        System.out.println("Traversing");
        dll.traverseDLL();
        dll.deleteDLL();
        
        System.out.println("Reverse Traversing");
        dll.reverseTraverseDLL();
        
        dll.searchNode(9);
    }
}