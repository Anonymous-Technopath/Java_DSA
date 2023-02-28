import java.util.*;
public class AboveAverageTemperature{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("How many days temperature?  ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Day "+(i+1)+"'s high temp: ");
            arr[i]=sc.nextInt();
        }
        double average=0;
        for(int i=0;i<n;i++){
            average=average+arr[i];
        }
        average=average/n;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>average){
                count++;
            }
        }
        System.out.println("Average = "+average);
        System.out.println(count+"day(s) above average");
    }
}