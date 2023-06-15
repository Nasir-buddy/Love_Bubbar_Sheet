import java.util.Arrays;
import java.util.Scanner;

public class first_missingpositive {
    static Scanner sc = new Scanner(System.in);
    public static int first_missing(int arr[]){
        Arrays.sort(arr);
        int count = 1; 
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == count){
                count++;
            }
        }
        return count;
    }
    public static int[] takeInput() {
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        System.out.print("Enter the element of the array : ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int Arr[] = takeInput();
        System.out.println("First missing number is : " + first_missing(Arr));
    }
}