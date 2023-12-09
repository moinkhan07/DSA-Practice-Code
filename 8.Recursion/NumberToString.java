public class NumberToString {

    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void numberToString(int n) {
        if(n == 0){
            return;
        }
        int lastDig = n % 10;
        numberToString(n/10);
        System.out.print(digits[lastDig]+" ");
    }

    public static void main(String[] args) {
        int n = 2019;
        numberToString(n);
    }
    
}
