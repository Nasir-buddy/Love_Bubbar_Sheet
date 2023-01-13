package Array;


class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        int mid = v.length / 2;
        int median = v[mid];
        if(v.length % 2 == 1){
            return median;
        } else {
            return ((v[mid] + v[mid - 1]) / 2);
        }
    }
}