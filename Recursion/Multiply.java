package Recursion;

import java.util.Scanner;

public class Multiply {
    public static int multiply_recursive(int m , int n){
        if(n == 0){
            return 0;
        }
        // int mul = multiply_recursive(m , n - 1);
        // int ans = m + mul;
        // return ans;
        return m + multiply_recursive(m, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int m = sc.nextInt();
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(multiply_recursive(m, n));
    }
}
