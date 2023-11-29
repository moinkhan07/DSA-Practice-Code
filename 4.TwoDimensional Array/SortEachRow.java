import java.util.Arrays;

public class SortEachRow {

    public static int[][] sortEachRow(int arr[][]) {
        for (int[] a : arr) {
            Arrays.sort(a);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {3,4,1,6},
            {8,4,6,5},
            {3,9,1,4}
        };

        int[][] sortedArr = sortEachRow(arr);
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[0].length;j++){
                System.out.print(sortedArr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
