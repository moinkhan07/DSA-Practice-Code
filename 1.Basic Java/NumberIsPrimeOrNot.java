import java.util.Scanner;

public class NumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num == 2){
         System.out.println("num is prime!");
        }else{
         for(int i = 2;i <= Math.sqrt(num);i++){
             if(num % i == 0){
                 isPrime = false;
             }
         }
         if(isPrime){
             System.out.println("num is prime!");
            }else{
             System.out.println("num is non-prime!");
            }
        }
        sc.close();
     }
}
