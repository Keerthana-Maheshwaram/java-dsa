import java.util.*;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter: ");
        int n=sc.nextInt();
        int h=fibona(n, new int[n+1]);
        System.out.println(h);
    }

    public static int fibona(int n,int[] qb){
        if(n==0||n==1){
            return n;
        }

        if(qb[n]!=0){
            return qb[n];
        }

        int d=fibona(n-1,qb)+fibona(n-2,qb);
        qb[n]=d;
        return d;
    }


}
