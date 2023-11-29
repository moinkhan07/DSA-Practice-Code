import java.util.Scanner;

public class SumOfRow {

    public static void sumOfRow(int arr[][],int n,int m) {
        for(int i = 0;i < n;i++){
            int sum = 0;
            for(int j = 0;j < m;j++){
                sum += arr[i][j];
            }
            System.out.println("Row "+i +" sum is " +sum);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int arr[][] = new int[n][m];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix elements:)");
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        sumOfRow(arr,n,m);
    }
    
}
