public class SinglyLinkedList{
    public Node head;
    public Node tail;
    public int size;
    
    //Creation of singly linked list
    public Node createSinglyLinkedList(int nodeValue){
        head=new Node();
        Node node=new Node();
        node.value = nodeValue;
        node.next = null;
        head=node;
        tail=node;
        size=1;
        return head;
    }
    
    //Insert method singly linked list
    public void insertInLinkedList(int nodeValue,int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head==null){
            createSinglyLinkedList(nodeValue);
            return;
        }else if(location==0){
            node.next=head;
            head=node;
        }else if(location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }
        else{
            Node tempNode = head;
            for(int i=1;i<location;i++){
                tempNode=tempNode.next;
            }
            node.next=tempNode.next;
            tempNode.next=node;
        }
        size++;
    }
    
    //Traversing Singly Linked List
    public void traverseSinglyLinkedList(){
        if(head==null){
            System.out.println("Singly Linked List does not exist");
        }
        else{
            Node tempNode=head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("->");
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("\n");
    }
    
    //Searching a Node
    public boolean searchNode(int nodeValue){
        if(head!=null){
            Node tempNode=head;
            for(int i=0;i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("Found the node at location: "+i+"\n");
                    return true;
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }
    
    //Deleting a node from Singly Linked List
    public void deletionOfNode(int location){
        if(head==null){
            System.out.println("The singly linked list does not exist");
            return;
        }
        else if(location==0){
            head=head.next;
            size--;
            if(size==0){
                tail=null;
            }
        }else if(location >= size){
            Node tempNode=head;
            for(int i=0;i<size-1;i++){
                tempNode=tempNode.next;
            }
            if(tempNode==head){
                head=null;
                tail=null;
                size--;
                return;
            }
            tempNode.next=null;
            tail=tempNode;
            size--;
        }else{
            Node tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            size--;
        }
    }
    
    //Deleting entire Singly Linked List
    public void deleteSLL(){
        head=null;
        tail=null;
        size=0;
        System.out.println("The Singly Linked List has been deleted");
    }
}