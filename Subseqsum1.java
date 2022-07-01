// print hte first subsequence whose sum is equal to k

import java.util.*;

public class Subseqsum1 {
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
        subSeqSumK(0, arrl, 0, sum, arr, n);
        sc.close();
    }

    public static boolean subSeqSumK(int ind,ArrayList<Integer> arrl,int s,int sum,int[] arr,int n){
        if(ind==n){
            if(s==sum){
                System.out.println(arrl);
                return true;
            }
            return false;
        }

        arrl.add(arr[ind]);
        s+=arr[ind];
        if(subSeqSumK(ind+1,arrl,s,sum,arr,n)==true){
            return true;
        }
        arrl.remove(arrl.size()-1);
        s-=arr[ind];
        if(subSeqSumK(ind+1,arrl,s,sum,arr,n)==true){
            return true;
        }
        return false;

    }
}
