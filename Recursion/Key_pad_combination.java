package Recursion;
import java.util.Scanner;
import java.util.ArrayList;

public class Key_pad_combination {
    static String codes[] = {".;" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz" };
    public static ArrayList<String> getKPC(String str){
        if(str.length() == 0){
            ArrayList<String> emptyStr = new ArrayList<>();
            emptyStr.add("");
            return emptyStr;
        }
        char ch = str.charAt(0); // saving the first index word of the string.
        String ros = str.substring(1); // ROS = Rest of the string.
        
        ArrayList<String> reres = getKPC(ros); // Calling recursion 
        ArrayList<String> myans = new ArrayList<>(); // creatin new array list answer 

        String codeforch = codes[ch - '0']; // finding the length of the char by subtracting 
        for(int i = 0; i < codeforch.length(); i++){ // running on the first character which we stored previously
            char newch = codeforch.charAt(i); // set on the first litter 
            for(String charIndex : reres){ // running on the recursion result which is returned.
                myans.add(newch + charIndex); // adding the first index of the stored result in the recursion result by running the loop
            }
        }
        return myans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> ans = getKPC(str);
        System.out.println(ans); 
    }
}
