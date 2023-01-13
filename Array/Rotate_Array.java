package Array;

import java.util.Scanner;

public class Rotate_Array {
    static Scanner sc = new Scanner(System.in);

    public static int rotate_kth(int arr[] , int k){
        int n = arr.length;
        k %= n;
        if(k < 0){
            k += arr.length;
        }
        // reversing the whole array
        reverseArr(arr , 0 , n - 1);
        // reversing the 0 to k - 1 element 
        reverseArr(arr , 0 , k - 1);
        // reversing the k ton - 1 element 
        reverseArr(arr , k , n - 1);
        return n;
    }

    public static void reverseArr(int arr[] , int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
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
        System.out.print("Enter the kth reverse : ");
        int k = sc.nextInt();
        
        rotate_kth(arr , k);
        print(arr);
    }
}
