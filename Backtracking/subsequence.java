package Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class subsequence {
    static Scanner sc = new Scanner(System.in);

    public static ArrayList<Integer> takeInput() {
        System.out.print("Enter the n no: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int inp = sc.nextInt();
            list.add(inp);
        }
        return list;
    }
    public static ArrayList<ArrayList<Integer>> Allsubsets(ArrayList<Integer> nums){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(nums , 0 , ans , new ArrayList<>());
        System.out.println(ans);
        return ans;
    }
    public static void helper(ArrayList<Integer> nums, int i ,ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr){
        ArrayList<Integer> copyAns = new ArrayList<>(curr);
        ans.add(copyAns);

        for(int index = i; index < nums.size(); index++){
            if(index > i && nums.get(index).equals(nums.get(index - 1)));
            curr.add(nums.get(index));
            helper(nums, index + 1, ans, curr);
            curr.remove(curr.size() - 1);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = takeInput();
        Allsubsets(list);
        
    }
}
