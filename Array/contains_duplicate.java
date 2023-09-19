import java.util.HashSet;

public class contains_duplicate{
    public static void main(String[] args) {
           // Arrays.sort(nums);
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == nums[i + 1]){
        //       return nums[i];   
        //     }
        // }
        // return 0;
        HashSet<Integer> seen = new HashSet<>();
        for(int i : nums){
            if(seen.contains(i)){
                return i;
            }
            seen.add(i);
        }
        return -1;
    }
}