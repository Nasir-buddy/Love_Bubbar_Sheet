package Recursion;

import java.util.Scanner;

public class Display_array_decreasing {
    static Scanner sc = new Scanner(System.in);
    public static void  display_reverse(int arr[] , int i){
        if(i == arr.length){
            return;
        }
        display_reverse(arr, i + 1);
        System.out.println(arr[i]);
        
    }
    public static int[] takeInput(){
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the " + i + "th index of element : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void printarray(int arr[] , int i){
        if(i == arr.length){
            return;
        }
        System.out.println(arr[i]);
        printarray(arr, i + 1);
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        display_reverse(arr, 0);
    }
}
