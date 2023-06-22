package Recursion;

import java.util.Scanner;

public class print_zig_zag {
    public static void print(int n){
        if(n == 0){
            return;
        }
        System.out.println("pre" + n);
        print(n - 1);
        System.out.println("In" + n);
        print(n - 1);
        System.out.println("Post" + n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        print(n);
    }
}
