import java.util.*;

public class StringPall {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter: ");
        String s=sc.nextLine();
        boolean h=StringPallindr(0, s);
        System.out.println(h);
    }

    public static boolean StringPallindr(int i, String d){
       // int i=0;
        int n=d.length();
        if(i>=n/2){
            return true;
        }

        if(d.charAt(i)!=d.charAt(n-i-1)){
           return false;
        }
        
        return StringPallindr(i+1, d);

    }
}
