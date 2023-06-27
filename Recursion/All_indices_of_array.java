package Recursion;

import java.util.Scanner;

public class All_indices_of_array {
    static Scanner sc = new Scanner(System.in);

    public static int[] all_indices(int arr[], int x, int idx, int fsf) {
        if(idx == arr.length){
            return new int[fsf];
        }
        if(arr[idx] == x){
            int iarr[] = all_indices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int iarr[] = all_indices(arr, x, idx + 1, fsf);
            return iarr;
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
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = takeinput();
        System.out.println("Enter the element to found : ");
        int x = sc.nextInt();
       int ans[] = all_indices(arr, x, 0, 0);
       print(ans);
    }
}