package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class get_sub_sequence_revise{
    public static ArrayList<String> getsubs(String str){
        if(str.length() == 0){
            ArrayList<String> newStr = new ArrayList<>();
            newStr.add(" ");
            return newStr;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> result = getsubs(ros);

        ArrayList<String> remainingResult = new ArrayList<>();

        for(String i : result){
            remainingResult.add(" " + i);
        }
        for(String i : result){
            remainingResult.add(ch +  i);
        }
        return remainingResult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> ans = getsubs(str);
        System.out.println(ans);
    }
}