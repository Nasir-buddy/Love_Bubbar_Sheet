package Recursion;

import java.util.Scanner;

public class All_indices_revise {
    static Scanner sc = new Scanner(System.in);
    public static int[] helper(int arr[] , int x){
        return all_indices(arr, x, 0, 0);
    }
    public static int[] all_indices(int arr[] , int x, int idx, int fsf){
        if(idx == arr.length){
            return new int[fsf];
        }
        if(arr[idx] == x){
            int indexArr[] = all_indices(arr, x, idx + 1, fsf + 1);
            indexArr[fsf] = idx;
            return indexArr;
        } else {
            int indexArr[] = all_indices(arr , x , idx + 1 , fsf);
            return indexArr;
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
       int ans[] = helper(arr, x);
       print(ans);
    }
}