
import java.util.Arrays;
import java.util.Scanner;

public class MergeSorted_array {
    static Scanner sc = new Scanner(System.in);
    
    public static void printarr(int arr[]){
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergesortedarr(int arr1[] , int arr2[]){
        int i = 0; 
        int j = 0; 
        int k = 0;
        int ans[] = new int[arr1.length + arr2.length];
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                ans[k++] = arr1[i++];
            }
            else{
                ans[k++] = arr2[j++];
            }
        }
        while(i < arr1.length){
            ans[k++] = arr1[i++];
        }
        while(j < arr2.length){
            ans[k++] = arr2[j++];
        }
        return ans;
    }
    public static int[] takeinput(){
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        System.out.println("Enter the element of the array 1 : ");
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr1[] = takeinput();
        int arr2[] = takeinput();
        printarr(mergesortedarr(arr1, arr2));
    }
}
