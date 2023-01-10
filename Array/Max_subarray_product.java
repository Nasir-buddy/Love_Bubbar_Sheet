class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long ans = arr[0];
        long max = ans;
        long min = ans;
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < 0){
                long temp = min;
                min = max;
                max = temp;
            }
            max = Math.max(arr[i] , (max * arr[i]));
            min = Math.min(arr[i] , (min * arr[i]));
            ans = Math.max(ans , max);
        }
        return ans;
    }
}