package Array;

import java.util.Scanner;

public class Uniquequestion {
    static Scanner sc = new Scanner(System.in);

    public static void calculation(int arr[]){
        int n = arr.length;
        int a = n * (n + 1)/2;
        int b = 0;
        for(int i = 0; i < arr.length; i++){
            b += arr[i];
        }
        int ans1 = a - b;
        System.out.println("Difference of a and b : " + ans1);

      int a2 = n * (n + 1) * (2 * n + 1)/6;
        int b2 = 0;
        for(int i = 0; i < arr.length; i++){
              b2 += arr[i] * arr[i];
        }
        int ans2 = a2 - b2;
        System.out.println("Difference of a^2 and b^2 : " + ans2);
        int afterdivide = ans2 / ans1;
        System.out.println("Value of (a^2 + b^2) / (a - b) : " + afterdivide);

        // value of a 
        int firstans = (afterdivide + ans1) / 2;
        System.out.println("Value of missing element : " + firstans);
        System.out.println("value of repetiting element : " + (firstans - ans1));

        
    }

    public static int[] takeinput(){
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
    int arr[] = takeinput();
        calculation(arr);
    }
}
