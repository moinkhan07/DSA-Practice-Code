public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fn = fibonacci(n-1)+fibonacci(n-2);
        return fn; 
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    
}
