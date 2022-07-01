import java.util.*;

public class Subseq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("length of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter arr: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> arrl=new ArrayList<Integer>();
        subSequences(arr,arrl,0);
        
    }

    public static void subSequences(int[] arr,ArrayList<Integer> arrl, int ind){
        if(ind==arr.length){
            if(arrl.size()>0){
                System.out.println(arrl);
            }
            if(arrl.size()==0){
                System.out.println("{}");
            }
           
        }

       else{
           //subsequence without ivolving the element
           subSequences(arr, arrl, ind+1);
            //subsequence including the element
           arrl.add(arr[ind]);
           subSequences(arr, arrl, ind+1);
           arrl.remove(arrl.size()-1);
       }

    }
}
