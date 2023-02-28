public class StackLL{
    SinglyLinkedList linkedlist;
    
    public StackLL(){
        linkedlist=new SinglyLinkedList();
    }
    
    //Push Method
    public void push(int value){
        linkedlist.insertInLinkedList(value,0);
        System.out.println("Inserted "+value+" in Stack");
    }
    
    //is Empty
    public boolean isEmpty(){
        if(linkedlist.head==null){
            return true;
        }
        return false;
    }
    
    //Pop method
    public int pop(){
        int result=-1;
        if(isEmpty()){
            System.out.println("Stack is Empty!");
        }else{
            result=linkedlist.head.value;
            linkedlist.deletionOfNode(0);
        }
        return result;
    }
    
    //Peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }else{
            return linkedlist.head.value;
        }
    }
    
    //Delete
    public void deleteStack(){
        linkedlist.head=null;
        System.out.println("The stack has been deleted");
    }
}