import java.util.*;
public class Find_first_and_last_occ {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Integer> findlastandfirst(int arr[] , int x){
        int first = -1;
        int last = -1;
        for(int i = 0; i < arr.length; i++){
           if(arr[i] == x){
             if(first == -1){
                first = i;
                }
                last = i;
           } 
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(first);
        ans.add(last);
        return ans;
    }
    public static int[] takeinput(){
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the element of the array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = takeinput();
        System.out.println("Enter the element that you want to find : ");
        int x = sc.nextInt();
        System.out.println(findlastandfirst(arr, x));
    
    }
}