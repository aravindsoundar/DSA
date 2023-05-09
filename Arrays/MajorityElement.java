// moore's voting algorithm.

import java.util.*;

public class MajorityElement{
    public static void main(String[] args){
        int[] arr= {4,4,3,2,4,4,4,5,6,4,5,4,4,4,4};
        System.out.println(findMajorityElement(arr,arr.length));
    }
    public static int findMajorityElement(int[] arr, int n){
        int candidate= arr[0];
        int count =1;

        for(int i=1;i<n;i++){
            if(arr[i]==candidate){
                count++;
            }
            else{
                count--;
            }

            if(count==0){
                candidate = arr[i];
                count=1;
            }
        }

        //verify if candidate is the answer
        count=0;
        for(int val:arr){
            if(val==candidate){
                count++;
            }
        }
        if(count>n/2){
            return candidate;
        }
        else{
            return -1;
        }
    }
}