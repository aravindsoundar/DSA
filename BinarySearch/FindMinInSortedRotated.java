public class FindMinInSortedRotated{
    public static void main(String[] args){
        int[] arr = {4,5,7,8,9,1,2,3};
        System.out.println(findMin(arr));

    }
    public static int findMin(int[] arr){
        int left=0, right=arr.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(arr[mid]<arr[right]){
                right=mid;

            }
            else{
                left=mid+1;

            }

        }
        return arr[left];
    }
}