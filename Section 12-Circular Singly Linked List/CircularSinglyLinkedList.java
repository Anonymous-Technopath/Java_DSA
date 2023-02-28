public class CircularSinglyLinkedList{
    public Node head;
    public Node tail;
    public int size;
    
    //Creation of circular singly linked list
    public Node createCSLL(int nodeValue){
        head=new Node();
        Node node=new Node();
        node.value = nodeValue;
        node.next = node;
        head=node;
        tail=node;
        size=1;
        return head;
    }
    
    //Insert method circular singly linked list
    public void insertCSLL(int nodeValue,int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head==null){
            createCSLL(nodeValue);
            return;
        }else if(location==0){
            node.next=head;
            head=node;
            tail.next=head;
        }else if(location>=size){
            tail.next=node;
            tail=node;
            tail.next=head;
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
    public void traverseCSLL(){
        if(head==null){
            System.out.println("CSLL does not exist");
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
    public void deleteNode(int location){
        if(head==null){
            System.out.println("The CSLL does not exist");
            return;
        }
        else if(location==0){
            head=head.next;
            tail.next=head;
            size--;
            if(size==0){
                tail=null;
                head.next=null;
                head=null;
            }
        }else if(location >= size){
            Node tempNode=head;
            for(int i=0;i<size-1;i++){
                tempNode=tempNode.next;
            }
            if(tempNode==head){
                head.next=null;
                head=null;
                tail=null;
                size--;
                return;
            }
            tempNode.next=head;
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
    
    //Deleting entire Circular Singly Linked List
    public void deleteSLL(){
        if(head==null){
            System.out.println("CSLL does not exist");
            return;
        }
        head=null;
        tail.next=null;
        tail=null;
        size=0;
        System.out.println("The CSLL has been deleted");
    }
}