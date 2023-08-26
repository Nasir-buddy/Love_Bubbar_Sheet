package Backtracking;
import java.util.*;

public class permutation {
    static Scanner sc = new Scanner(System.in);
    public static int[] takeInput(){
        System.out.print("Enter the n no: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void permuataion(int arr[] , int l , int r){
        if(l == r){
            printArray(arr);
            return;
        }
        for(int i = l; i <= r; i++){
            swap(arr, i , l);
            permuataion(arr, l + 1, r);
            swap(arr, i , l);
        }
    }
    public static void swap (int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        permuataion(arr, 0, arr.length - 1);
    }
}
