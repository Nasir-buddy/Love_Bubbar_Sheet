package Array;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.sound.midi.Soundbank;

public class Find_Union_and_intersection_of2array {

    public static int intersection(int arr[] , int arr1[]){
       Set<Integer> set = new HashSet<>();
       int count = 0; 
       for(int i : arr){
        set.add(i);
       }
       for(int x : arr1){
        if(set.contains(x)){
            count++;
            set.remove(x);
        }
       }
       return count;
    }

    public static int arr_union(int arr[] , int arr1[]){
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        for(int x : arr1){
            set.add(x);
        }
        return set.size();
    }

    public static int distinct(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        return set.size();
    }
    static Scanner sc = new Scanner(System.in);
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
    public static void main(String[] args) {
        System.out.println("Enter the choice : \n 1. To find Union in array. \n 2. To find union of two array. \n 3. To find intersection in the array. \n 4. To find all at one time.");
        int n = sc.nextInt(); 
        switch(n){
            case 1:{
                int arr[] = takeinput();
                System.out.println("Distint elements are : " + Find_Union_and_intersection_of2array.distinct(arr));
                break;
            }
            case 2:{
                int arr[] = takeinput();
                System.out.println("Enter the second array : ");
                int arr1[] = takeinput();
                System.out.println("Union of the two arraya : " + Find_Union_and_intersection_of2array.arr_union(arr, arr1));
                break;
            } 
            case 3:{
                int arr[] = takeinput();
                System.out.println("Enter the second array : ");
                int arr1[] = takeinput();
                System.out.println("Intersection of the array is : " + Find_Union_and_intersection_of2array.intersection(arr, arr1));
                break;
            }
            case 4 :{
                int arr[] = takeinput();
                System.out.println("Enter the second array : ");
                int arr1[] = takeinput();
                System.out.println("Distint elements are : " + Find_Union_and_intersection_of2array.distinct(arr));
                System.out.println("Union of the two arraya : " + Find_Union_and_intersection_of2array.arr_union(arr, arr1));
                System.out.println("Intersection of the array is : " + Find_Union_and_intersection_of2array.intersection(arr, arr1));
                break;
            }
            default : {
                System.out.println("Enter valid choice !!!!!");
            }
        }
    }
}
