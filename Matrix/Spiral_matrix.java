package Matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class Spiral_matrix {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Integer> printspiral(int arr[][]){
        int row = arr.length; 
        int col = arr[0].length; 
        int left = 0; 
        int top = 0; 
        int right = col - 1; 
        int bottom = row - 1; 

        ArrayList<Integer> ans = new ArrayList<>();
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                ans.add(arr[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                ans.add(arr[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
    public static int[][] takeInput(){
        System.out.print("Enter the row no : ");
        int row = sc.nextInt();
        System.out.print("Enter the col no : ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void print(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = takeInput();
        System.out.println(printspiral(arr));
    }
}
