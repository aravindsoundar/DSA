import java.util.*;
public class targetsumSubset{
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int target=60;
        ArrayList<Integer> ans= new ArrayList<Integer>();
        tss(arr,0,target,ans);
    }

    public static void tss(int[] arr,int i, int target, ArrayList<Integer> ans){

        if(i==arr.length){
            if(target==0)
            System.out.println(ans);
            return;
        }

        // select ith element
        ans.add(arr[i]);
        tss(arr,i+1,target-arr[i],ans);
        ans.remove(ans.size()-1);

        //reject ith element
        tss(arr,i+1,target,ans);
    }
}