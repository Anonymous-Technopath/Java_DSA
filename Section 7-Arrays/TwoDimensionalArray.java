public class TwoDimensionalArray{
    int arr[][]=null;
    //Constructor
    public TwoDimensionalArray(int numberOfRows,int numberOfColumns){
        arr=new int[numberOfRows][numberOfColumns];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                arr[row][col]=Integer.MIN_VALUE;
            }
        }
    }
    
    //Inserting Value in Array
    public void insertValueInTheArray(int row,int col,int value){
        try{
            if(arr[row][col]==Integer.MIN_VALUE){
                arr[row][col]=value;
                System.out.println("The value is successfully inserted");
            }
            else{
                System.out.println("The cell is occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }
    
    //Traversing in 2D Array
    public void traverse2DArray(){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
    
    //Searching value in array
    public void searchingValue(int value){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(arr[row][col]==value){
                    System.out.println("Value found at row:"+row+" column:"+col);
                    return;
                }
            }
        }
        System.out.println("Value not found");
    }
    
    //Deleting value
    public void deleteValueFromArray(int row,int col){
        try{
            System.out.println("Successfully deleted:"+arr[row][col]);
            arr[row][col]=Integer.MIN_VALUE;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }
}