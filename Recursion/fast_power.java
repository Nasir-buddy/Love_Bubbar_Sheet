package Recursion;

import java.util.Scanner;

public class fast_power {
    public static double fastpower(double n, int x, int m){
        if(x == 0){
            return 1;
        }
        if(x < 0){
            return fastpower(1 / n, Math.abs(x) ,m);
        }
        if((x & 1) == 0){
            return fastpower((n % m  * n % m) % m, x / 2 , m);
        }
        return (n % m * fastpower(n, x - 1 , m) % m) % m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the power no: ");
        int x = sc.nextInt();
        System.out.print("Enter the modulo % : ");
        int m = sc.nextInt();
        System.out.println(fastpower(n, x, m));
    }
}
