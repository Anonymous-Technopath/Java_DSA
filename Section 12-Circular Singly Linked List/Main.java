class Main{
    public static void main(String[] args){
        CircularSinglyLinkedList csll=new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(8,1);
        csll.insertCSLL(2,0);
        csll.insertCSLL(9,2);
        csll.insertCSLL(1,4);
        csll.insertCSLL(7,1);
        
        System.out.println("Traversing:");
        csll.traverseCSLL();
        
        csll.searchNode(10);
        csll.deleteNode(5);
        System.out.println("Traversing:");
        csll.traverseCSLL();
        csll.deleteNode(0);
        System.out.println("Traversing:");
        csll.traverseCSLL();
        csll.deleteNode(2);
        System.out.println("Traversing:");
        csll.traverseCSLL();
    }
}