import java.util.Scanner;
 
 public class SearchInSortedMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] mat = {{1,7,13,20},
                       {2,8,14,21},
                       {3,9,15,22},
                       {4,10,16,23}};
        int target = sc.nextInt();
        System.out.println(Search(mat,target));
    }

    public static boolean Search(int[][] mat, int target){
        int i=0, j=mat.length-1;
        while(i<mat.length && j>=0){
            if(mat[i][j]==target){
                return true;
            }
            else if(mat[i][j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
 }