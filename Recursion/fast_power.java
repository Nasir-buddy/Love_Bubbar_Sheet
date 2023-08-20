package Recursion;

public class fast_power {
    public static double fastpower(double a, int b, int m){
        if(b == 0){
            return 1;
        }
        if(b < 0){
            return fastpower(1 / a, Math.abs(b) ,m);
        }
        if((b & 1) == 0){
            return fastpower((a % m  * a % m) % m, b / 2 , m);
        }
        return (a % m * fastpower(a, b - 1 , m) % m) % m;
    }
    public static void main(String[] args) {
        System.out.println(fastpower( 2 , -10, 500));
    }
}
