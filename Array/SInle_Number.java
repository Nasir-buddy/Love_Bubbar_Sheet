import java.util.ArrayList;
import java.util.Scanner;

public class SInle_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array list : ");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(size);
        for(int i = 0; i < list.size(); i++){
            System.out.println("Enter the number : ");
            list.add(i);
        }
        System.out.println(list);
    }
}
