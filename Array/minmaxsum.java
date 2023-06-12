package Array;

import java.util.Scanner;

public class minmaxsum {
    static Scanner sc = new Scanner(System.in);
    public static int min_max_sum(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return min + max;
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] takeInput(){
        System.out.print("Enter the size of the array.");
        int size = sc.nextInt();
        System.out.print("Enter the element of the array : ");
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int Arr[] = takeInput();
        System.out.print(min_max_sum(Arr));
    }

}
