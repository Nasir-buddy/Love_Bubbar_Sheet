package Matrix;

import java.util.Scanner;

public class max_no_of_1s {
    static Scanner sc = new Scanner(System.in);
    // First approach n * log m compexity 
    public static int findrow(int mat[][]){
        int overallmax = 0; 
        int ans = 0; 
        for(int i = 0; i < mat.length; i++){
            int count1s = binarySearch(mat , i);
            if(count1s > overallmax){
                overallmax = count1s;
                ans = i;
            }
        }
        return ans; 
    }
    public static int binarySearch(int mat[][] , int row){
        int low = 0; 
        int high = mat[0].length - 1;
        int findone = mat[0].length;
        while(low <= high){
            int mid = (low + high) / 2;
            if(mat[row][mid] == 1){
                findone = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        int count = mat[0].length - findone;
        return count;
    }
    public static int[][] takeInput() {
        System.out.print("Enter the row no : ");
        int row = sc.nextInt();
        System.out.print("Enter the col no : ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void print(int arr[][]) {
        System.out.println("Print rotated...");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    // second approach n TC
    public static int gfgapproach(int mat[][]){
        int row = 0; 
        int col = mat[0].length - 1; 
        int ans = -1;
        while(row < mat.length && col >= 0){
            if(mat[row][col] == 1){
                col--;
                ans = row;
            } else {
                row++;
            }
        }
        return ans; 
    }
    // third approach n^2 TC
    public static int leetcodeapproach(int mat[][] , int row){
        int maxcount = 0; 

        for(int i = 0; i < mat.length; i++){
            int count = 0; 
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(count > maxcount){
                maxcount = count; 
                row = i;
            }
        }
        return row;
    }
    public static void main(String[] args) {
        int arr[][] = takeInput();
        System.out.println(findrow(arr));
        System.out.println(gfgapproach(arr));
        System.out.println(leetcodeapproach(arr, 0));
    }
}