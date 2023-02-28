class Main{
    public static void main(String[] args){
        QueueArray newQueue=new QueueArray(5);
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);
        newQueue.enQueue(5);
        newQueue.enQueue(6);
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.deQueue());
    }
}