package Graph;

import java.util.Scanner;

public class DFS {

    public static void printHeper(int edge[][] , int sv , boolean visited[]){
        System.out.print(sv + "->");
        visited[sv] = true;
        int n = edge.length;
        for(int i = 0; i < n; i++){
            if(edge[sv][i] == 1 && !visited[i]){
                printHeper(edge, i, visited);
            }
        }
    }

    public static void print(int edge[][]){
        boolean visited[] = new boolean[edge.length];
        for(int i = 0; i < edge.length; i++){
            if(!visited[i]){
                printHeper(edge , i , visited);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the verteces : ");
        int n = sc.nextInt();
        System.out.println("Enter the edges : ");
        int e = sc.nextInt();
        int edge[][] = new int[n][n];
        for(int i = 0; i < e; i++){
            int fv = sc.nextInt();
            int sv = sc.nextInt();

            edge[fv][sv] = 1;
            edge[sv][fv] = 1;
        }
        System.out.println("......DFS of Graph.....");
        print(edge);
    }
}
