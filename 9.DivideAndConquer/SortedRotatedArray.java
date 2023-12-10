public class SortedRotatedArray {

    public static int sortedRotatedArray(int arr[],int si,int ei,int tar) {
        if (si > ei) {
            return -1;
        }

        int mid = si +(ei-si)/2;
        if (arr[mid] == tar) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if(arr[si] <= tar && tar <= arr[mid]){
                return sortedRotatedArray(arr, si, mid-1, tar);
            }else{
                return sortedRotatedArray(arr, mid+1, ei, tar);
            }
        }
        else{
            if(arr[mid] <= tar && tar <= arr[ei]){
                return sortedRotatedArray(arr, mid+1, ei, tar);
            }else{
                return sortedRotatedArray(arr, si, mid-1, tar);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,6,0,1,2};
        System.out.println(sortedRotatedArray(arr, 0, arr.length-1, 4));
    }
    
}
