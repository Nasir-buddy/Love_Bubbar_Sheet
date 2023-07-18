package String;
import java.util.*;
public class palindrome {
    public static boolean palindrome_check(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0; 
        int j = s.length() - 1; 
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(palindrome_check(s));
    }
}
