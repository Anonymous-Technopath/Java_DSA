import java.util.*;
class Main{
    public static void main(String[] args){
        SinglyLinkedList sLL=new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        
        sLL.insertInLinkedList(2,1);
        sLL.insertInLinkedList(7,3);
        sLL.insertInLinkedList(2,4);
        sLL.insertInLinkedList(4,1);
        sLL.insertInLinkedList(6,3);
        sLL.insertInLinkedList(9,2);
        sLL.traverseSinglyLinkedList();
        
        sLL.searchNode(7);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter location to be deleted:");
        int n=sc.nextInt();
        sLL.deletionOfNode(n);
        System.out.println("Updated Linked List");
        sLL.traverseSinglyLinkedList();
    }
}