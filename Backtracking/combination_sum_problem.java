import java.util.*;

public class Solution
{
    public static void helper(int arr[], List<List<Integer>> ans, int index, int target, ArrayList<Integer> current){
         if(target == 0){
           List<Integer> currcopy = new ArrayList<>(current);
            ans.add(currcopy);
            return;
        }
        for(int i = index; i < arr.length; i++){
            if(i > index && arr[i] == arr[i - 1]){
                continue;
            }
            current.add(arr[i]);
            helper(arr, ans, i + 1, target - arr[i], current);
            current.remove(current.size() - 1); // backtracking
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target)
    {
            //You can code here
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, ans, 0, target, new ArrayList<>());
        return ans;
    }
}
