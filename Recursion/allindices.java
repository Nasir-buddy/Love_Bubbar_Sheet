package Recursion;
import java.util.Scanner;
public class allindices {
    static Scanner sc = new Scanner(System.in);
    public static int[] helper(int arr[] , int target){
        return allindices(arr , target , 0 , 0);
    }
    public static int[] allindices(int arr[], int target , int index , int fsf){
        if(index == arr.length){
            return new int[fsf];
        }
        if(arr[index] == target){
            int indexarr[] = allindices(arr, target, index + 1, fsf + 1);
            indexarr[fsf] = index;
            return indexarr;
        } else {
            int indexarr[] = allindices(arr, target, index + 1, fsf);
            return indexarr;
        }
    }
    public static int[] takeInput(){
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int target(){
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        return target;
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        int target = target();
        int ans[] = helper(arr , target);
        print(ans);
    }
}
