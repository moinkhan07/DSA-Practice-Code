class BubbleSort{

    public static int[] bubbleSort(int arr[]) {
        int n = arr.length;
        for(int i = 0;i < n-1;i++){
            for(int j = 0;j < n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {9,4,7,3,21,1,5,6};
        int sortedArr[] = bubbleSort(arr);
        for(int i = 0;i < sortedArr.length;i++){
            System.out.print(sortedArr[i]+" ");
        }
    }
}