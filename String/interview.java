
import java.util.*;
public class interview {
    // public static boolean isValid(String str){
    //     // for checking the word is alphabet and numbe
    //     if(str == ("[a-z A-Z 0-9]")){
    //         return false;
    //     }
    //     // for consecutive same 
    //     for(int i = 0; i < str.length() - 1; i++){
    //         if(str.charAt(i) == str.charAt(i + 1)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the word : ");
    //     String str = sc.next();
    //     if(isValid(str)){
    //         System.out.println(str + " word is correct.");
    //     } else {
    //         System.out.println(str + "word is not correct.");
    //     }
    // }

    // question 2
    // public static boolean isValidPass(int arr[]){
    //     // we using hashset to check validity for best efficiency
    //     HashSet<Integer> saw = new HashSet<>();
    //     for(int i : arr){
    //         if(saw.contains(i)){
    //             return false;// we have seen multiple times
    //         } else {
    //             saw.add(i);
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     int n = 100;
    //     int arr[] = new int[n];
    //     int index = 1;
    //     for(int i = 0; i < arr.length; i++){
    //         arr[i] = index;
    //         index++; 
    //     }
        
    //     boolean isValid = isValidPass(arr);
    //     if(isValid){
    //         System.out.println("array is valid");
    //     } else {
    //         System.out.println("not valid");
    //     }
    // }
    // question 3
    // public static void checkEO(int arr[]){
    //     List<Integer> odd = new ArrayList<>();
    //     List<Integer> even = new ArrayList<>();
  
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] % 2 == 0) {
    //             even.add(arr[i]);
    //         }
    //         else {
    //             odd.add(arr[i]);
    //         }
    //     }
  
    //     Collections.sort(even);
  
    //     Collections.sort(odd, Collections.reverseOrder());
  
    //     int i = 0;
    //     for (int j = 0; j < odd.size(); j++) {
    //         arr[i] = odd.get(j);
    //         i++;
    //     }
    //     for (int j = 0; j < even.size(); j++) {
    //         arr[i] = even.get(j);
    //         i++;
    //     }
    // }
    // public static void main(String[] args) {
    //     int[] array = {56, 67, 24, 3, 88, 17, 55};
        
    //     checkEO(array);
    // }
    //question 3
    public static void Reverse(String str){
        char ch;
        for(int i = 0; i< str.length(); i++){
            ch = str.charAt(i);
            //to check character is ch or not
            if(Character.isLetter(ch)){
                // for lower case
                if(Character.isLowerCase(ch)){
                    ch = (char)(122 - (int)(ch) + 97);
                }
                else if(Character.isUpperCase(ch)){
                    ch = (char)(90 - (int)(ch) + 65);
                }
            }
            System.out.println(ch);
        }
    }
    public static void main(String[] args) {
        String str = "NasirAli";
        System.out.println("Reverse of " + str + "is : ");
        Reverse(str);
    }
}
