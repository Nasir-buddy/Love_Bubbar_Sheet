import java.util.*;

public class Absolute_min_diff {
    static Scanner sc = new Scanner(System.in);
    public static int[] takeinput(){
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static List<List<Integer>> solve(int arr[]){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }
        for(int i = 1; i < arr.length; i++){
            List<Integer> temp = new ArrayList<>();
            if(minDiff == arr[i] - arr[i - 1]){
                temp.add(arr[i - 1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = takeinput();
        List<List<Integer>> ans = new ArrayList<>(solve(arr));
        System.out.print(ans);
    }
}
