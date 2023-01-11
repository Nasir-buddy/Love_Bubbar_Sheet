package Array;

import java.util.Scanner;

public class Move_all_negative_oneside {
    static Scanner sc = new Scanner(System.in);
    public static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int moveNegative(int arr[]){
        int i = 0; 
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] < 0 && arr[i] > 0){
                i++;
                j--;
            } else if (arr[i] > 0 && arr[j] < 0){
                swap(arr , i , j);
                i++;
                j--;
            } else if (arr[i] > 0 && arr[j] > 0){
                j--;
            } else if (arr[i] < 0 && arr[j] < 0){
                i++;
            }
        }
        return 0;
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] takeinput() {
        System.out.print("Enter the length of the array : ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.print("Enter the element of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = takeinput();
        moveNegative(arr);
        print(arr); 
    }
}
