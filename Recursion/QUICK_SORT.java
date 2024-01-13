import java.util.Scanner;
public class QUICK_SORT{
    static Scanner sc = new Scanner(System.in);
    public static int[] takeInput(){
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void helper(int arr[]){
        quickSort(arr, 0 , arr.length - 1);
    }
    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int pivot = partition(arr, si, ei);
        quickSort(arr, si, pivot - 1);
        quickSort(arr, pivot + 1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[si];
        int count = 0;
        for(int i = si + 1; i <= ei; i++){
            if(arr[i] <= pivot){
                count++;
            }
        }
        int pivotPos = si + count;
        int temp = arr[si];
        arr[si] = arr[pivotPos];
        arr[pivotPos] = temp;
        int i = si; 
        int j = ei;
        while(i < pivotPos && j > pivotPos){
            if(arr[i] < arr[pivotPos]){
                i++;
            } else if(arr[j] > arr[pivotPos]){
                j--;
            } else {
                int temp_ = arr[i];
                arr[i] = arr[j];
                arr[j] = temp_;
                i++;
                j--;
            }
        }
        return pivotPos;
    }
    public static void main(String args[]){
        System.out.println("Enter the size of the array : ");
        int arr[] = takeInput();
        helper(arr);
        print(arr);
    }
    public static void print(int arr[]){
        System.out.println("Array elements after sorting the previous array");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}