public class PowerOf2 {

    public static int powerOf2(int x,int n) { // O(n)
        if(n == 0)return 1;
        return x * powerOf2(x, n-1);
    }

    public static int powerOf2Optimised(int x,int n) { // O(logn)
        if(n == 0)return 1;
        int halfPowerSqr = powerOf2(x, n/2) * powerOf2(x, n/2);
        if(n % 2 != 0){
            halfPowerSqr = x * halfPowerSqr;
        }
        return halfPowerSqr;
    }

    public static void main(String[] args) {
        System.out.println(powerOf2Optimised(2, 5));
    }
    
}
