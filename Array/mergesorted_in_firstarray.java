import java.util.Arrays;
import java.util.Scanner;

public class mergesorted_in_firstarray {
    static Scanner sc = new Scanner(System.in);
    public static int[] mergesorted(int arr1[] , int arr2[]){
        int i = arr1.length;
        int j = arr2.length; 
        while(j < arr2.length){
            arr1[i++] = arr2[j++];
        }
        Arrays.sort(arr1);
        return arr1;
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
        System.out.println("Enter the first array.");
        int arr1[] = takeinput();
        System.out.println("Enter the second array.");
        int arr2[] = takeinput();
        System.out.println(mergesorted(arr1, arr2));
    }
}
