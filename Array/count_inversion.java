package Array;

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long count = 0;
    static long[] merge2sorted(long left[] , long right[]){
        int i = 0; 
        int j = 0;
        int k = 0;
        long merged[] = new long[left.length + right.length];
        
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                merged[k] = left[i];
                i++;
                k++;
            } else {
                count += (left.length - i);
                merged[k] = right[j];
                k++;
                j++;
            }
        }
        while(i < left.length){
            merged[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged;
    }
    
    static long[] mergeSort(long arr[] , int low , int high){
        if(low == high){
            long base[] = new long[1];
            base[0] = arr[low];
            return base;
        }
        int mid = (low + high) / 2;
        long left[] = mergeSort(arr , low , mid);
        long right[] = mergeSort(arr , mid + 1 , high);
        
        long merged[] = merge2sorted(left , right);
        
        return merged;
    }
    
    
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        count = 0;
        mergeSort(arr , 0 , (int)N - 1);
        return count;
    }
}