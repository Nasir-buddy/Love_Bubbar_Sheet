package Recursion;
import java.util.*;
public class Key_pad_combination {
    static String codes[] = {
      ".;" 
    , "abc" 
    , "def" 
    , "ghi" 
    , "jkl" 
    , "mno" 
    , "pqrs" 
    , "tu" 
    , "vwx" 
    , "yz" };
    public static List<String> getKPC(String str){
        // below is the edge case for empty case on leetcode
        if(str.length() == 0){
            List<String> nulllist = new ArrayList<>();
            return nulllist;
        } else {
            // short form
            // return helper(str);
            List<String> ans = new ArrayList<>(helper(str));
            return ans;
        }
    }
    public static List<String> helper(String str){
        if(str.length() == 0){
            ArrayList<String> emptyStr = new ArrayList<>();
            emptyStr.add("");
            return emptyStr;
        }
        char ch = str.charAt(0); // saving the first index word of the string.
        String ros = str.substring(1); // ROS = Rest of the string.
        
        List<String> reres = helper(ros); // Calling recursion 
        List<String> myans = new ArrayList<>(); // creatin new array list answer 

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
       List<String> ans = new ArrayList<>(getKPC(str));
        System.out.println(ans); 
    }
}
