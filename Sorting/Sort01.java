public class Sort01{
    public static void main(String[] args){
        int[] arr = {1,1,0,0,1,0,1,0,1,1,0};
        sort(arr);
        for(int val:arr){
            System.out.println(val+" ");
        }
    }
    public static void sort(int[] arr){
        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]==0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
                i++;
                j++;
            }
            else{
                i++;
            }
        }
    }
}