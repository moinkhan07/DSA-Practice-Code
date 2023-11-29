public class SelectionSort {
    public static int[] selectionSort(int arr[]) {
        int n = arr.length;
        for(int i = 0;i < n-1;i++){
            int minPos = i;
            for(int j = i+1;j < n;j++){
                if(arr[minPos] > arr[j]){
                   minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {9,4,7,3,21,1,5,6};
        int sortedArr[] = selectionSort(arr);
        for(int i = 0;i < sortedArr.length;i++){
            System.out.print(sortedArr[i]+" ");
        }
    }
}
