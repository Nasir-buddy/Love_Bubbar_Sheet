import java.util.*;
public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
   	   //You Can Code Here
        Collections.sort(A); 
        for(int i = 0; i < A.size() - 1; i = i + 2){
            Collections.swap(A, i, i + 1);
        }
        ArrayList<Integer> ans = new ArrayList<>(A);
        return ans;
    }
}