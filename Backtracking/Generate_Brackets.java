package Backtracking;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Generate_Brackets {
    public static List<String> generateBrackets(int n){
        List<String> ans = new ArrayList<>();
        helpergenerate(ans, "", n, 0, 0, 0);
        return ans;
    }
    public static void helpergenerate(List<String> ans, String current, int n, int i, int open , int close){
        //base case
            if(i == 2 * n){
                ans.add(current);
                return;
            }
            // 1st logic
            if(open < n){
                current = current + '(';
                helpergenerate(ans, current, n, i + 1, open + 1, close);
                current = current.substring(0 , current.length() - 1);
            }
            // 2nd logic
            if(close < open){
                current = current + ')';
                helpergenerate(ans, current, n, i + 1, open, close + 1);
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ans = new ArrayList<>(generateBrackets(n)); 
        System.out.println(ans);
    }
}
