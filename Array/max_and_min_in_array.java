package Array;

import java.util.Scanner;

public class max_and_min_in_array {
    static Scanner sc = new Scanner(System.in);

    public static int maxOfarr(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int misa = maxOfarr(arr, idx + 1);
        if (misa > arr[idx]) {
            return misa;
        } else {
            return arr[idx];
        }

    }

    public static int minOfarr(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int min = minOfarr(arr, idx + 1);
        if (min < arr[idx]) {
            return min;
        } else {
            return arr[idx];
        }
    }

    public static int[] takeinput() {
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the element of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = takeinput();
        int max = maxOfarr(arr, 0);
        System.out.println("Max element is : " + max);
        int min = minOfarr(arr, 0);
        System.out.print("Min element is : " + min);
    }
}