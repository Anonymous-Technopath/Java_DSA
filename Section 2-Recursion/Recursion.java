public class Recursion {
    public static void main(String[]args){
        Recursion rec=new Recursion();
        int n=rec.factorial(-10);
        System.out.println(n);
    }
    public int factorial(int a){
        if (a<0){
            return -1;
        }
        if(a==1 || a==0){
            return 1;
        }
        return a*factorial(a-1);
    }
}
