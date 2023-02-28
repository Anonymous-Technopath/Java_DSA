public class QueueLinkedList{
    LinkedList list;
    
    //Creation
    public QueueArray(int size){
        list = new LinkedList();
        System.out.println("Queue is successfully created");
    }
    
    //is empty
    public boolean isEmpty(){
        if(list.head==null){
            return true;
        }else{
            return false;
        }
    }
    
    //Enqueue
    public void enQueue(int value){
        list.insertInLinkedList(value,list.size);
        System.out.println("Successfully inserted value in queue");
    }
    
    //Dequeue
    public int deQueue(){
        int value=-1;
        if(isEmpty()){
            System.out.println("The Queue is empty");
        }else{
            value=list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }
    
    //Peek
    public int peek(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }else{
            return list.head.value;
        }
    }
    
    //Delete
    public void deleteQueue(){
        list.head=null;
        list.tail=null;
        System.out.println("Queue has been successfully deleted");
    }
}