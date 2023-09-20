package Backtracking;

import java.util.Scanner;

public class Rat_in_a_maze {
    static Scanner sc = new Scanner(System.in);
    public static int[][] takeInput(){
        System.out.print("Enter the row: ");
        int r = sc.nextInt();
        System.out.print("Enter the col: ");
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static boolean isValid(int mat[][],boolean visited[][], int i, int j, int n, int m){
        if(i < n && i >= 0 && j < m && j >= 0 && mat[i][j] == 1 && !visited[i][j]){
            return true;
        }
        return false;
    }
    public static void ratInMaze(int mat[][],boolean visited[][], int i, int j, String path, int n, int m){
        if(i == n -1 && j == m - 1){
            System.out.println(path);
            return;
        }
        // down
        if(isValid(mat, visited, i + 1, j, n, m)){
            visited[i][j] = true;
            ratInMaze(mat, visited, i + 1, j, path + 'D', n, m);
            visited[i][j] = false;
        }
        // left
        if(isValid(mat, visited, i, j - 1, n, m)){
            visited[i][j] = true;
            ratInMaze(mat, visited, i, j - 1, path + 'L', n, m);
            visited[i][j] = false;
         }
        //  right
         if(isValid(mat, visited, i, j + 1, n, m)){
            visited[i][j] = true;
            ratInMaze(mat, visited, i, j + 1, path + 'R', n, m);
            visited[i][j] = false;
         }
        //  up
         if(isValid(mat, visited, i - 1, j, n, m)){
            visited[i][j] = true;
            ratInMaze(mat, visited, i - 1, j, path + 'U', n, m);    
            visited[i][j] = false;
         }
    }
    public static void main(String[] args) {
        int mat[][] = takeInput();
        int n = mat.length;
        int m = mat[0].length;
        boolean visited[][] = new boolean[n][m];
        visited[0][0] = true;
        ratInMaze(mat,visited, 0, 0, "", n, m);
    }
}
