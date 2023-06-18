package Matrix;

import java.util.Scanner;

public class Rotate90deg {
    static Scanner sc = new Scanner(System.in);

    public static int[][] Rotate_90_deg(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }

    public static int[][] reverse(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            int r = 0;
            int l = arr[i].length - 1;
            while(r < l){
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;            
                r++;
                l--;
            }
        }
        return arr;
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

    public static void main(String[] args) {
        int arr[][] = takeInput();
        Rotate_90_deg(arr);
        reverse(arr);
        print(arr);
    }
}