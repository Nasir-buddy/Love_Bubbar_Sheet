package Array;
import java.util.Scanner;
public class Sort_0_1_2 {

    static Scanner sc = new Scanner(System.in);
    public static void swap(int arr[] , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int swap012(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = 0; 
        int k = n - 1;

        while(i <= k){
            if(arr[i] == 1){
                i++;
            } else if(arr[i] == 0){
                swap(arr , i , j);
                i++;
                j++;
            } else {
                swap(arr , i , k);
                k--;
            }
        }
        return n;
    }
    public static int[] takeinput(){
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the element of the array only in 0 1 and 2 : ");
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
        int arr[] = takeinput();
        swap012(arr);
        print(arr);
    }
}