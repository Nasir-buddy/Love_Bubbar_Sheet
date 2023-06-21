package Recursion;
import java.util.Scanner;
public class factorial_recursive {
public static int factorial(int m){
        if(m == 0){
            return 1;
        }
        // int mul = multiply_recursive(m , n - 1);
        // int ans = m + mul;
        // return ans;
        return m * factorial(m - 1);
        // int fact = factorial(m - 1);
        // int ans = fact * m;
        // return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int m = sc.nextInt();
        System.out.println(factorial(m));
    }
}
