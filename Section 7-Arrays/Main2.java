import java.util.Arrays;
public class Main2{
    public static void main(String[] args){
        TwoDimensionalArray tda=new TwoDimensionalArray(3,3);
        tda.insertValueInTheArray(0,0,10);
        tda.insertValueInTheArray(1,0,20);
        tda.insertValueInTheArray(0,2,30);
        tda.insertValueInTheArray(1,1,40);
        tda.insertValueInTheArray(2,2,50);
        
        System.out.println("Traversing 2D Array");
        tda.traverse2DArray();
        
    }

}