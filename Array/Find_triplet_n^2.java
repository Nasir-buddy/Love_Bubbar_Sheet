
class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    Arrays.sort(A);
       // Your code Here
     for(int i = 1; i < A.length - 1; i++){
         int start = 0;
         int end = A.length - 1;
         while(start < i && i < end){
             if(A[i] + A[start] + A[end] == X){
                 return true;
             }
             if(A[i] + A[start] + A[end] > X){
                 end--;
                 
             } else {
                 start++;
             }
         }
     }
     return false;
    }
}
