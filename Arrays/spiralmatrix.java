public class spiralmatrix{
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4,5},
                       {6,7,8,9,10},
                       {11,12,13,14,15}};
        spmat(arr);
    }
    public static void spmat(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        int rmin=0, rmax = arr.length-1;
        int cmin=0, cmax = arr[0].length-1;

        int count = 0;

        while(count<n*m){
            //top
            for(int col=cmin;col<=cmax && count<n*m;col++){
                System.out.print(arr[rmin][col]+" ");
                count++;
            }
            rmin++;
            //right
            for(int row=rmin;row<=rmax && count<n*m;row++){
                System.out.print(arr[row][cmax]+" ");
                count++;
            }
            cmax--;
            //bottom
            for(int col=cmax;col>=cmin && count<n*m;col--){
                System.out.print(arr[rmax][col]+" ");
                count++;
            }
            rmax--;
            //left
            for(int row=rmax;row>=rmin && count<n*m;row--){
                System.out.print(arr[row][cmin]+" ");
                count++;
            }
            cmin++;
        }
    }
}