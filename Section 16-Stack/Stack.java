public class Stack{
    int[] arr;
    int topOfStack;
    
    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack=-1;
        System.out.println("Stack created with size:"+size);
    }
    
    //is Empty
    public boolean isEmpty(){
        if(topOfStack==-1){
            return true;
        }
        return false;
    }
    
    //is Full
    public boolean isFull(){
        if(topOfStack==arr.length-1){
            return true;
        }
        return false;
    }
    
    //Push
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is Full!");
        }else{
            topOfStack++;
            arr[topOfStack]=value;
            System.out.println("The value is successfully inserted");
        }
    }
    
    //Pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }else{
            topOfStack--;
            return arr[topOfStack+1];
        }
    }
    
    //Peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }else{
            return arr[topOfStack];
        }
    }
    
    //Delete
    public void deleteStack(){
        arr=null;
        topOfStack=-1;
        System.out.println("The stack has been deleted");
    }
}