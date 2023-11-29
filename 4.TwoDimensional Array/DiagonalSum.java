public class DiagonalSum {

    public static void diagonalSum(int arr[][],int n) {

        int using2LoopSum = 0;
        // Time Complexity =  O(n^2)
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(i == j){
                    using2LoopSum += arr[i][j];
                }
                else if(i + j == n-1){
                    using2LoopSum += arr[i][j];
                }
            }
        }

        int using1LoopSum = 0;
        // Time Complexity =  O(n)
        for(int i = 0;i < n;i++){
            using1LoopSum  += arr[i][i];
            if(i != n-i-1){
                using1LoopSum += arr[i][n-i-1];
            }
        }
        System.out.println("Using2LoopSum -> O(n^2) :) "+  using2LoopSum);
        System.out.println("Using1LoopSum -> O(n) :) "+  using1LoopSum);
    }

    public static void main(String[] args) {
        int arr[][]= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        // int arr[][] = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        int n = 4;
        diagonalSum(arr,n);
    }
    
}
