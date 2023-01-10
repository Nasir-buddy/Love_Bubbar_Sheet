package Array;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Find_kth_min_max {
    static Scanner sc = new Scanner(System.in);
    public static int min(int arr[] ,int k){
        PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < k; i++){
            pqueue.add(arr[i]);
        }
        for(int i = k; i < arr.length; i++){
            if(pqueue.peek() > arr[i]){
                pqueue.poll();
                pqueue.add(arr[i]);
            }
        }
        return pqueue.peek();
    }
    public static int max(int arr[] , int k){
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        for(int i = 0; i < k; i++){
            pqueue.add(arr[i]);
        }
        for(int i = k; i < arr.length; i++){
            if(pqueue.peek() < arr[i]){
                pqueue.poll();
                pqueue.add(arr[i]);
            }
        }
        return pqueue.peek();
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
    public static void main(String[] args) {
        int arr[] = takeinput();
        System.out.print("Enter the kth element : ");
        int k = sc.nextInt();
        System.out.println("The kth smallest element is " + Find_kth_min_max.min(arr, k));
        System.out.print("The kth greatest element is " + Find_kth_min_max.max(arr, k));
    }
}
