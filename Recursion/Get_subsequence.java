package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_subsequence {
    public static ArrayList<String> get_subsequence(String str){
        if(str.length() == 0){
            ArrayList<String> nothing = new ArrayList<>();
            nothing.add("");
            return nothing;
        }
        char ch = str.charAt(0);
        String nextWord = str.substring(1);
        ArrayList<String> recursionResult = get_subsequence(nextWord);

        ArrayList<String> ans = new ArrayList<>();
        for(String i : recursionResult){
            ans.add("" +  i);
        }
        for(String i : recursionResult){
            ans.add(ch + i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = get_subsequence(str);
        System.out.println(res);
    }
}
