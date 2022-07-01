//count the number of subsequneces whose sum is equal to k
import java.util.*;

public class Subseqsum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("length of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter arr: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("eneter the sum: ");
        int sum=sc.nextInt();
        ArrayList<Integer> arrl=new ArrayList<Integer>();
        int j= subSeqSumK(0, arrl, 0, sum, arr, n);
        System.out.println(j);

        sc.close();
    }

    public static int subSeqSumK(int ind,ArrayList<Integer> arrl,int s,int sum,int[] arr,int n){
        if(ind==n){
            if(s==sum){
                return 1;
            }
            return 0;
        }
        arrl.add(arr[ind]);
        s+=arr[ind];
        int l=subSeqSumK(ind+1,arrl,s,sum,arr,n);
        s-=arr[ind];
        arrl.remove(arrl.size()-1);
        int r=subSeqSumK(ind+1,arrl,s,sum,arr,n);
        return l+r;

    }
    
}
