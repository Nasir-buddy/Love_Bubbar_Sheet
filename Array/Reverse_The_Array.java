package Array;

import java.util.Scanner;

public class Reverse_The_Array{

    static Scanner sc = new Scanner(System.in);

    public static int reverse(int arr[]){
        int n = arr.length; 
        int i = 0; 
        int j = n - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return n;
    }
    public static int[] takeinput(){
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the element of the array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = takeinput();
        reverse(arr);
        print(arr);
    }
}