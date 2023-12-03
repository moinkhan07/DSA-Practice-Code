public class PowerOf2 {

    public static String powerOf2(int n) {
        return (n & (n-1)) == 0 ? "Power of 2" : "Not a power of 2";
    }

    public static void main(String[] args) {
        System.out.println(powerOf2(4));
    }

    
}
