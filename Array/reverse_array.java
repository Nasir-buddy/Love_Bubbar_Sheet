package Array;
import java.util.Scanner;
public class reverse_array {
    public static int[] reverse(int arr[]){
        int start = 0; 
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void print(int arr[]){
        
        System.out.println("Printing the array..");
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static Scanner sc = new Scanner(System.in);
    public static int[] takeInput(){
        System.out.print("Enter the Size of the array :");
        int size = sc.nextInt();
        System.out.print("Enter the element of the array : ");
        int arr[] = new int[size];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] sargs){
        int arr[] = takeInput();
        reverse(arr);
        print(arr);
    }
}
