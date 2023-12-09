public class QuickSort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[],int si,int ei) { // T.C= O(nlogn) S.C= O(1)
        if(si >= ei)return;
        int pivotInd = partition(arr, si, ei);
        quickSort(arr, si, pivotInd-1);
        quickSort(arr, pivotInd+1, ei);
    }

    public static int partition(int arr[],int si,int ei) {
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si;j < ei;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6,8,-1,2,5,0,3};
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
    
}
