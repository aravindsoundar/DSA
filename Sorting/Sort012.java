public class Sort012{
    public static void main(String[] args){
        int[] arr = {0,0,2,1,1,0,2,1,1,0,2,2,1};
        sort(arr);
        for(int val:arr){
            System.out.println(val+" ");
        }
    }

    public static void sort(int[] arr){
        int i=0,j=0,k=arr.length-1;
        while(i<=k){
            if(arr[i]==0){
                 int temp = arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                 i++;
                 j++;
            }
            else if(arr[i]==1){
                i++;
            }
            else{
                int temp = arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k--;
                // value of i should not be incremented. we are not sure what is coming from right hand side.
            }
        }
    }
}