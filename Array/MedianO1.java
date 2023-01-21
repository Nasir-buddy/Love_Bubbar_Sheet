import java.util.Scanner;


public class MedianO1{
    static Scanner sc = new Scanner(System.in);
    public static double find(int a[] , int b[]){
        if(a.length > b.length){
            int temp[] = a;
            a = b;
            b = temp;
        }
        int low = 0;
        int high = a.length;
        int totalEle = a.length + b.length;
        while(low <= high){
            int aleft = (low + high)/2;
            int bleft = (totalEle + 1) / 2 - aleft;
            
            // 1. below variable is Aleft - 1; 
            // 2. aleft
            // 3. bleft - 1;
            // 4. bleft; 
            int alm1 = (aleft == 0) ? Integer.MIN_VALUE : a[aleft - 1];
            int al = (aleft == a.length) ? Integer.MAX_VALUE : a[aleft];
            int blm1 = (bleft == 0) ? Integer.MIN_VALUE : b[bleft - 1];
            int bl = (bleft == b.length) ? Integer.MAX_VALUE : b[bleft];

            // valiiid segragation
            if(alm1 <= bl && blm1 <= al){
                double median = 0.0;
                if(totalEle % 2 == 0){
                    //Finding Left max and Right min.
                    // int leftmax = Math.max(a[aleft], b[bleft]);
                    // int rightmin = Math.min(a[aleft], b[bleft]);
                    median = Math.max(alm1, blm1) + Math.min(al ,  bl) / 2.0;
                } else {
                    int leftmax = Math.max(alm1 , blm1);
                    median = leftmax;
                }
                return median;
            } 
            else if(alm1 > bl){
                // there are more elements to be picked in left part 'b' array
                high = aleft - 1;
            }
            else if(blm1 > al){
                // there are more element to be pcked in left part from  'a' array
                //aleft is also called mid for first array
                low = aleft + 1;
            }
        }
        return 0;
    }
    public static int[] takeinput(){
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Enter the first array....");
        int arr1[] = takeinput();
        System.out.println("Enter the second array : ");
        int arr2[] = takeinput(); 
        System.out.println(MedianO1.find(arr1, arr2));
    }
}
