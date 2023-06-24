package Recursion;

import java.util.Scanner;

public class Find_greatest_in_Array {
    static Scanner sc = new Scanner(System.in);
    public static int find_greatest(int arr[] , int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int misa = find_greatest(arr, idx + 1);
        // Maximum in smaller arrar from index + 1 to the last index
        if(misa > arr[idx]){
            return misa;
        } else {
            return arr[idx];
        }
    }
    public static int[] takeinput() {       
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + i + "th index element: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        int arr[] = takeinput();
        System.out.println("The Greatest element in this array is " + find_greatest(arr, 0));
    }
}
