class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int count = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        int i = -1;
        int sum = 0;
        map.put(0 , 1);
        while(i < arr.length - 1){
            i++;
            sum += arr[i];
            if(map.containsKey(sum)){
                count += map.get(sum);
                // map.put(sum , map.get(sum) + 1);
                return true;
            }else {
                map.put(sum , 1);
            }
        }
        return false;
    }
}