import java.util.*;

public class SumNnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter: ");
        int n=sc.nextInt();
        printDecreasing(n);
        System.out.println("   ");
        int d=sumOfNum(n);
        System.out.println(d);
    }

    public static void printDecreasing(int n){
        if(n==0){
           return;
        }
         System.out.println(n);
       printDecreasing(n-1);
        
    }

    public static int sumOfNum(int n){
        if(n==0){
            return 0;
        }

        int d=n + sumOfNum(n-1);
        return d;
    }
    
}
