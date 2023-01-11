package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Merge2sortedArr {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Integer> sortandmerge(int arr1[] , int arr2[]){
        int i = 0; 
        int j = 0; 
        // int k = 0;

        // int ans[] = new int[arr1.length + arr2.length];
        ArrayList<Integer> arrlist = new ArrayList<>();
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arrlist.add(arr1[i++]);
            } else {
                arrlist.add(arr2[j++]);
            }
        }

        while(i < arr1.length){
            arrlist.add(arr1[i++]);
        }
        while(j < arr2.length){
            arrlist.add(arr2[j++]);
        }
        return arrlist;
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
        System.out.println("Enter the first array.");
        
        int arr1[] = takeinput();
        System.out.println("Enter the second array.");
        int arr2[] = takeinput();
      System.out.println(Merge2sortedArr.sortandmerge(arr1, arr2));
    }
}
