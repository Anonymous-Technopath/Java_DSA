public class CircularDoublyLinkedList{
    public DoublyNode head;
    public DoublyNode tail;
    public int size;
    
    //Creation of singly linked list
    public DoublyNode createCDLL(int nodeValue){
        head=new DoublyNode();
        DoublyNode newNode=new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = newNode;
        newNode.prev = newNode;
        head=newNode;
        tail=newNode;
        size=1;
        return head;
    }
    
    //Insert method doubly linked list
    public void insertNode(int nodeValue,int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if(head==null){
            createCDLL(nodeValue);
            return;
        }else if(location==0){
            newNode.next=head;
            newNode.prev=tail;
            head.prev=newNode;
            head=newNode;
            tail.next=newNode;
        }else if(location>=size){
            newNode.next=head;
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
            head.prev=tail;
        }
        else{
            DoublyNode tempNode = head;
            for(int i=1;i<location;i++){
                tempNode=tempNode.next;
            }
            newNode.next=tempNode.next;
            newNode.prev=tempNode;
            tempNode.next=newNode;
            newNode.next.prev=newNode;
        }
        size++;
    }
    
    //Traversing Circular Doubly Linked List
    public void traverseCDLL(){
        if(head==null){
            System.out.println("DLL does not exist");
        }
        else{
            DoublyNode tempNode=head;
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
    
    //Reverse Traversing Circular Doubly Linked List
    public void reverseTraverseCDLL(){
        if(head==null){
            System.out.println("CDLL does not exist");
        }
        else{
            DoublyNode tempNode=tail;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("<-");
                }
                tempNode=tempNode.prev;
            }
        }
        System.out.println("\n");
    }
    
    //Searching a Node
    public boolean searchNode(int nodeValue){
        if(head!=null){
            DoublyNode tempNode=head;
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
    
    //Deleting a node from Circular Doubly Linked List
    public void deleteNode(int location){
        if(head==null){
            System.out.println("CDLL does not exist");
            return;
        }
        else if(location==0){
            if(size==1){
                head.next=null;
                tail.next=null;
                head=null;
                tail=null;
                size=0;
                return;
            }
            head=head.next;
            head.prev=tail;
            tail.next=head;
            size--;
        }else if(location >= size){
            if(size==1){
                head.next=null;
                tail.next=null;
                head=null;
                tail=null;
                size=0;
                return;
            }
            tail=tail.prev;
            head.prev=tail;
            tail.next=head;
            size--;
        }else{
            DoublyNode tempNode=head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            tempNode.next.prev=tempNode;
            size--;
        }
    }
    
    //Delete CDLL
    public void deleteCDLL(){
        DoublyNode tempNode=head;
        for(int i=0;i<size;i++){
            tempNode.prev=null;
            tempNode=tempNode.next;
        }
        tail.next=null;
        head=null;
        tail=null;
        size=0;
        System.out.println("CDLL has been deleted");
    }
}