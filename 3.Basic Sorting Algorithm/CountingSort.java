public class CountingSort {
    public static int[] countingSort(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0;i < n;i++){
            count[arr[i]]++; // For finding frequencies of elements in an array we use this.
        }
        System.out.println();
        int j = 0;
        for(int i = 0;i < n;i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        int sortedArr[] = countingSort(arr);
        for(int i = 0;i < sortedArr.length;i++){
            System.out.print(sortedArr[i]+" ");
        }
    }
}
