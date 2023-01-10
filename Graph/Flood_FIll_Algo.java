package Graph;
import java.util.Scanner;
import java.util.Arrays;
public class Flood_FIll_Algo {
    
    static Scanner sc = new Scanner(System.in);
    public static void Flood_Fill(int arr[][] , int row , int col , String psf , boolean visited[][]){
        if(row < 0 || col < 0 || row == arr.length || col == arr[0].length || arr[row][col] == 1 || visited[row][col] == true){
            return;
        }
        if(row == arr.length && col == arr[0].length){
            System.out.println(psf);
            return;
        }

        visited[row][col] = true;
        Flood_Fill(arr, row - 1, col, psf + "t", visited);
        Flood_Fill(arr, row , col - 1, psf + "l", visited);
        Flood_Fill(arr, row + 1, col, psf + "d", visited);
        Flood_Fill(arr, row, col + 1, psf + "r", visited);
        visited[row][col] = false;
    }

    public static void print(int arr[][]){
        System.out.println(Arrays.deepToString(arr));
    }
    public static void main(String[] args) {
        int row , col;
        System.out.println("Entter the row length : ");
        row = sc.nextInt();
        System.out.println("Enter the col length : ");
        col = sc.nextInt();
     
        int arr[][] = new int[row][col];
       for(row = 0; row < arr.length; row++){
        for(col = 0; col < arr[0].length; col++){
            arr[row][col] = sc.nextInt();
        }
       }
       boolean visited[][] = new boolean[row][col];
       Flood_Fill(arr, 0, 0, "", visited);
       print(arr);
    }
}
