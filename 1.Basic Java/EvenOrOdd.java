import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        while(true){
            System.out.println("For exit enter '0' | Enter The Number: ");
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            if(num % 2 == 0){
                even = even + num;
            }else{
                odd = odd + num;
            }
            System.out.println("Sum Of Even is "+ even);
            System.out.println("Sum Of Odd is "+ odd);
        }
        sc.close();
    }
}
