public class QueueArray{
    int arr[];
    int topOfQueue;
    int beginningOfQueue;
    
    //Creation
    public QueueArray(int size){
        this.arr=new int[size];
        this.topOfQueue=-1;
        this.beginningOfQueue=-1;
        System.out.println("Queue is successfully created with size of:"+size);
    }
    
    //is full
    public boolean isFull(){
        if(topOfQueue==arr.length-1){
            return true;
        }else{
            return false;
        }
    }
    
    //is empty
    public boolean isEmpty(){
        if((beginningOfQueue==arr.length)||(beginningOfQueue==-1)){
            return true;
        }else{
            return false;
        }
    }
    
    //Enqueue
    public void enQueue(int value){
        if(isFull()){
            System.out.println("Queue is Full!");
        }else if(isEmpty()){
            beginningOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted value in queue");
        }else{
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted value in queue");
        }
    }
    
    //Dequeue
    public int deQueue(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }else{
            int result=arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue>topOfQueue){
                beginningOfQueue=-1;
                topOfQueue=-1;
            }
            return result;
        }
    }
    
    //Peek
    public int peek(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }else{
            return arr[beginningOfQueue];
        }
    }
    
    //Delete
    public void deleteQueue(){
        arr=null;
        beginningOfQueue=-1;
        topOfQueue=-1;
        System.out.println("Queue has been successfully deleted");
    }
}