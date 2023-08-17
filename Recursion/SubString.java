package Recursion;
import java.util.Scanner;
public class SubString {
    public static int subString(String str, String word){
        return helper(str, word , 0);
    }
    public static int helper(String s , String w , int i){
        if(i + w.length() > s.length()){
            return 0;
        }
        int subAnswer = helper(s, w, i + 1);

        boolean isMatch = s.substring(i, i + w.length()).equals(w);
        if(isMatch){
            return subAnswer + 1;
        } else {
            return subAnswer;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("Enter the word: ");
        String word = sc.next();
        System.out.println(subString(str, word));
    }
}
