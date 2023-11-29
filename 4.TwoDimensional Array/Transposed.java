class Transposed{
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };

        int r = arr.length;
        int c = arr[0].length;
        int arr2 [][] = new int[c][r];

        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                arr2[j][i] = arr[i][j];
            }
        }

        for(int i = 0;i < arr2.length;i++){
            for(int j = 0;j < arr2[0].length;j++){
                System.out.print(arr2[i][j] +" ");
            }
            System.out.println();
        }
    }
}