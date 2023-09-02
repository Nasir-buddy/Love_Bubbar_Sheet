package Backtracking;

import java.util.*;

public class generate_pranthesis {
    public static void AllParenthesis(int n) {
        helper("", n, 0, 0, 0);
    }

    public static void helper(String current, int n, int i, int open, int close) {
        if (i == 2 * n) {
            System.out.println(current);
            return;
        }

        if (open < n) {
            current = current + "(";
            helper(current, n, i + 1, open + 1, close);
            current = current.substring(0, current.length() - 1);
        }

        if (close < open) {
            current = current + ")";
            helper(current, n, i + 1, open, close + 1);
        }
    }

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        double usedMemory = totalMemory - freeMemory;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of no ");
        int n = sc.nextInt();
        AllParenthesis(n);

        System.out.println("Total Memory: " + totalMemory + " bytes");
        System.out.println("Free Memory: " + freeMemory + " bytes");
        System.out.println("Used Memory: " + usedMemory / (1024 * 1024) + " MB");
    }
}
