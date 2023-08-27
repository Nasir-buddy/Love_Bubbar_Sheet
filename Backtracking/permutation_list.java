package Backtracking;
import java.util.*;

public class permutation_list{
    static Scanner sc = new Scanner(System.in);
    public static int[] takeInput(){
        System.out.print("Enter the n no: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void printList(List<List<Integer>> ans){
       System.out.println(ans);
    }
    public static List<List<Integer>> permute(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr , 0 , arr.length - 1, ans);
        return ans;
    }
    public static List<List<Integer>> helper(int[] arr, int l , int r , List<List<Integer>> ans){
        if(l == r){
            List<Integer> newans = new ArrayList<>();
            for(int i : arr){
                newans.add(i);
            }
            ans.add(newans);
        }
        for(int i = l; i <= r; i++){
            swap(arr, i , l);
            helper(arr, l + 1, r, ans);
            swap(arr, i, l);
        }
        return ans;
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        List<List<Integer>> ans = new ArrayList<>(permute(arr));
        printList(ans);
    }
}