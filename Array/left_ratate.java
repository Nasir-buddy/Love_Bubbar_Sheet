public class Solution {
    public int[][] multipleLeftRotation(int[] A, int[] B) {
        //You Can Code Here
        int ans[][] = rotateby(A,B);
        return ans;
    }
    public static int[][] rotateby(int a[], int b[]){
        int n = a.length; 
        int m = b.length;
        int ans[][] = new int[m][n];

        int temp[] = new int[n * 2];
        for(int i = 0; i < n; i++){
            temp[i] = a[i];
            temp[i + n] = a[i];
        }
        for(int i = 0; i < m; i++){
            int offset = b[i] % n;
            for(int j = 0; j < n; j++){
                ans[i][j] = temp[j + offset];
            }
        }
        return ans;
    }
}