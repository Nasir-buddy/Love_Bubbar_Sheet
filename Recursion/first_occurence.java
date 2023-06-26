package Recursion;

import java.util.Scanner;
public class first_occurence{
    static Scanner sc = new Scanner(System.in);
    public static int find_first (int arr[] , int i , int x){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == x){
            return i;
        } else {
            return find_first(arr, i + 1, x);
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
        System.out.println("Enter the element to found : ");
        int x = sc.nextInt();
        System.out.println(find_first(arr, 0, x));
    }
}