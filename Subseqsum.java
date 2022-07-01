//print all the subsequences whose sum is equal to k

import java.util.*;

public class Subseqsum {
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

    public static void subSeqSumK(int ind, ArrayList<Integer> arrl,int s,int sum,int arr[],int n){
        //here ind is the current index in array
        //s is the sum which we wll be changing by adding n removing elements
        //n is the size of teh array, n sum is the sum given by user
        if(ind==n){
            if(s==sum){
                System.out.println(arrl);
            }
            return;
        }

        arrl.add(arr[ind]);
        s+=arr[ind];
        subSeqSumK(ind+1, arrl, s, sum, arr, n);
        s-=arr[ind];
        arrl.remove(arrl.size()-1); //whatever element is at this position will be removed
        //not take condition
        subSeqSumK(ind+1, arrl, s, sum, arr, n);
    }
}
