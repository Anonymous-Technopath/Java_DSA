public class Main{
    public static void main(String[] args){
        SingleDimensionArray sda=new SingleDimensionArray(10);
        sda.insert(0,0);
        sda.insert(1,10);
        sda.insert(2,20);
        sda.insert(1,30);
        sda.insert(12,120);
        
        System.out.println("Traversing array");
        sda.traverseArray();
        
        System.out.println("Searching element in array");
        sda.searchInArray(120);
        
        sda.deleteValue(0);
        System.out.println("Traversing array");
        sda.traverseArray();
        
    }

}