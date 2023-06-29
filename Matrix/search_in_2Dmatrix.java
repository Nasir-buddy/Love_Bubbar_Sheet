package Matrix;
    
import java.util.Scanner;

public class search_in_2Dmatrix {
    static Scanner sc = new Scanner(System.in);
    public static boolean search(int matrix[][] , int target){
        int findrow = binariSearchRow(matrix, target);
        if(findrow == -1){
            return false;
        }
        boolean isFound = binarysearchNormal(matrix , findrow , target);
        return isFound;
    }
    public static int binariSearchRow(int matrix[][] , int target){
        int low = 0; 
        int high = matrix.length;
        // lc = last column
        int lc = matrix[0].length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(matrix[mid][0] <= target && matrix[mid][lc] >= target){
                return mid;
            } else if(matrix[mid][0] > target){
                high = mid - 1; 
            } else if(matrix[mid][0] < target){
                low = mid + 1; 
            }
        }
        return -1;
    }
    public static boolean binarysearchNormal(int matrix[][] , int row , int target){
        int low = 0; 
        int high = matrix.length - 1;
        while(low <= high){
            int mid = (low + high) / 2; 
            if(matrix[row][mid] == target){
                return true;
            } else if(matrix[row][mid] < target){
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
    public static int[][] takeinput(){
        System.out.print("Enter the row of the matrix : ");
        int row = sc.nextInt();
        System.out.print("Enter the col of the matrix : ");
        int col = sc.nextInt();
        System.out.println("Enter the elements of the matrix : ");

        int matrix[][] = new int[row][col];
    
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static int helper(){
        System.out.print("Enter the element that you want to find : ");
        int target = sc.nextInt();
        return target;
    }
    public static void main(String[] args) {
        int arr[][] = takeinput();
        int target = helper();
        System.out.println(search(arr, target));
    }
}
