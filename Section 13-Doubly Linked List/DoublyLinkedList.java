public class DoublyLinkedList{
    public DoublyNode head;
    public DoublyNode tail;
    public int size;
    
    //Creation of singly linked list
    public DoublyNode createDLL(int nodeValue){
        head=new DoublyNode();
        DoublyNode newNode=new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head=newNode;
        tail=newNode;
        size=1;
        return head;
    }
    
    //Insert method doubly linked list
    public void insertDLL(int nodeValue,int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if(head==null){
            createDLL(nodeValue);
            return;
        }else if(location==0){
            newNode.next=head;
            newNode.prev=null;
            head.prev=newNode;
            head=newNode;
        }else if(location>=size){
            newNode.next=null;
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
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
    
    //Traversing Doubly Linked List
    public void traverseDLL(){
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
    
    //Reverse Traversing Doubly Linked List
    public void reverseTraverseDLL(){
        if(head==null){
            System.out.println("DLL does not exist");
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
    
    //Deleting a node from Doubly Linked List
    public void deletionNodeDLL(int location){
        if(head==null){
            System.out.println("DLL does not exist");
            return;
        }
        else if(location==0){
            if(size==1){
                head=null;
                tail=null;
                size--;
                return;
            }
            head=head.next;
            head.prev=null;
            size--;
        }else if(location >= size){
            DoublyNode tempNode=tail.prev;
            if(size==1){
                head=null;
                tail=null;
                size--;
                return;
            }
            tempNode.next=null;
            tail=tempNode;
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
    
    //Delete DLL
    public void deleteDLL(){
        DoublyNode tempNode=head;
        for(int i=0;i<size;i++){
            tempNode.prev=null;
            tempNode=tempNode.next;
        }
        head=null;
        tail=null;
        size=0;
        System.out.println("DLL has been deleted");
    }
}