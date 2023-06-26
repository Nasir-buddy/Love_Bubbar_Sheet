package Recursion;
import java.util.Scanner;
public class last_occurence {
    static Scanner sc = new Scanner(System.in);
    public static int last(int arr[] , int idx , int x){
        if(arr.length - 1 == 0){
            return - 1;
        }
        if(arr[idx] == x){
            return idx;
        } else {
            int last = last(arr, idx - 1, x);
            return last;
        }
    }
    // second approach 
    public static int second_approach(int arr[], int idx, int x){
        if(idx == arr.length){
            return - 1;
        }
        int last = second_approach(arr, idx + 1, x);
        if(last == -1){
            if(arr[idx] == x){
                return idx;
            } else {
                return - 1;
            }
        } else {
            return last;
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
        System.out.println(last(arr, arr.length - 1, x));
        System.out.println(second_approach(arr, 0, x));
    }
}