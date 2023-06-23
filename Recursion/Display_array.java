package Recursion;

import java.util.Scanner;

public class Display_array {
    static Scanner sc = new Scanner(System.in);
    public static void display(int arr[] , int i){
        if(i == arr.length){
            return ;
        }
        System.out.println(arr[i]);
        display(arr, i + 1);
    }
    public static int[] takeinput(){
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the " + i + "th index element: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr);
        }
    }
    public static void main(String[] args) {
        int arr[] = takeinput();
        display(arr, 0);
    }
}
