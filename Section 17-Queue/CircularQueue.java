public class CircularQueue{
    int arr[];
    int topOfQueue;
    int beginningOfQueue;
    int size;
    
    //Creation
    public QueueArray(int size){
        this.arr=new int[size];
        this.topOfQueue=-1;
        this.beginningOfQueue=-1;
        this.size=size;
        System.out.println("CQ is successfully created with size of:"+size);
    }
    
    //is full
    public boolean isFull(){
        if(topOfQueue+1==beginningOfQueue){
            return true;
        }else if(beginningOfQueue==0 && topOfQueue=size-1){
            return true;
        }            
        else{
            return false;
        }
    }
    
    //is empty
    public boolean isEmpty(){
        if(topOfQueue==-1){
            return true;
        }else{
            return false;
        }
    }
    
    //Enqueue
    public void enQueue(int value){
        if(isFull()){
            System.out.println("The CQ is Full!");
        }else if(isEmpty()){
            beginningOfQueue=0;
            topOfQueue=0;
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted value in CQ");
        }else{
            if(topOfQueue==size-1){
                topOfQueue=0;
            }else{
                topOfQueue++;
            }
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted value in CQ");
        }
    }
    
    //Dequeue
    public int deQueue(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }else{
            int result=arr[beginningOfQueue];
            arr[beginningOfQueue]=0;
            if(beginningOfQueue==topOfQueue){
                beginningOfQueue=-1;
                topOfQueue=-1;
            }else if(beginningOfQueue==size-1){
                beginningOfQueue=0;
            }else{
                beginningOfQueue++;
            }
            return result;
        }
    }
    
    //Peek
    public int peek(){
        if(isEmpty()){
            System.out.println("CQ is empty");
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