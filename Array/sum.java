import java.util.HashMap;
import java.util.Scanner;

public class sum {
    static Scanner sc = new Scanner(System.in);
    static int[] takeinput(){
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static int[] sum(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        // saving into hash map
        for(int i = 0; i < arr.length; i++){
            //putting the all value of array in map
            map.put(arr[i], i);
        }
        // searching into map
        for(int i = 0; i < arr.length; i++){
            int getindex = arr[i];
            int remain = target - getindex;
            // is contain the element then return ans other wise increment the index i ...
            if(map.containsKey(remain)){
                // skipping duplicate elements
                if(i == map.get(remain)){
                    continue;
                }
                return new int[]{i, map.get(remain)};
            }
        }
        return new int [] {};
    }
    public static void main(String[] args) {
        int a[] = takeinput();
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int ans[] = sum(a, target);
        for(int i : ans){
            System.out.println(i);
        }
    }
}
