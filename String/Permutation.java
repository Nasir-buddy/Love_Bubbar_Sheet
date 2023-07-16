package String;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    public static boolean permutation_check(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        
        int n1 = s1.length();
        int n2 = s2.length();

        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0; i < n1; i++){
            if(!(c1[i] == c2[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(permutation_check(str1 , str2));
    }
}
