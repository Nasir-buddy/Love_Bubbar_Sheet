package Recursion;
import java.util.Scanner;
public class palindromeR {
    static boolean isPalindrome(String s){
        return isPalindromeHelper(s , 0 , s.length() - 1);
    }
    static boolean isPalindromeHelper(String s , int i , int j){
        if(i >= j){
            return true;
        }
        if(s.charAt(i) == s.charAt(j)){
            return isPalindromeHelper(s, i + 1, j - 1);
        } else {
            return false; 
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();
        System.out.println(isPalindrome(str));

    }
}
