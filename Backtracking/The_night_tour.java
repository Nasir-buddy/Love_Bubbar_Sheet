package Backtracking;

import java.util.Scanner;

public class The_night_tour {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        double usedMemory = totalMemory - freeMemory;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the valu of m : ");
        int m = sc.nextInt();
        int mat[][] = knightTour(n , m);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
       
        System.out.println("Total Memory: " + totalMemory + " bytes");
        System.out.println("Free Memory: " + freeMemory + " bytes");
        System.out.println("Used Memory: " + usedMemory / (1024 * 1024) + " MB");
    }
    public static int[][] knightTour(int n, int m){
        int arr[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = -1;
            }
        }
        arr[0][0] = 0;    
        
        // creating 8 path for moves
        int movesX[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int movesY[] = {1, 2, 2, 1, -1, -2, -2, -1};

        //passing the matrix and n size and moves on x y axis , and movex movey and 
        // current x and current y plus a step to run.
        helpertour(arr, n , m , movesX, movesY, 0, 0, 1);
        if(n > 1 && arr[1][0] == -1){
            arr[0][0] = -1;
        } 
        if(m > 1 && arr[0][1] == -1){
            arr[0][0] = -1;
        }
        return arr;
    }

    public static boolean helpertour(int mat[][], int n, int m ,int movesX[], int movesY[],
                                    int currX, int currY, int steps){
            
        if(steps == n * m){
            return true;
        }
        for(int i = 0; i < 8; i++){
            int nextX = currX + movesX[i];
            int nextY = currY + movesY[i];
            if(isValid(mat, n,m, nextX, nextY)){
                mat[nextX][nextY] = steps;
                boolean isTourCompletedByThere = helpertour(mat, n , m, movesX, movesY , nextX, nextY , steps + 1);
                if(isTourCompletedByThere){
                    return true;
                } else {
                    mat[nextX][nextY] = -1;
                }
            }
        }
        return false;
    }
    public static boolean isValid(int a[][], int n,int m, int nextX, int nextY){
        return nextX >= 0 && nextY >= 0 && nextX < n && nextY < m && a[nextX][nextY] == -1;
    }
}
