public class MergeSortOnArrayOfString {

    public static void sort(String str[],int si,int ei) {
        if(si >= ei) return;
        int mid = si +(ei-si)/2;

        sort(str, si, mid);
        sort(str, mid+1, ei);
        merge(str,si,ei,mid);
    }

    public static void merge(String arr[], int si, int ei, int mid) {
        int tempSize = ei - si + 1;
        String[] temp = new String[tempSize];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void print(String str[]) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        String str[] = {"sun","earth","mars","mercury","pluto"};
        sort(str, 0, str.length-1);
        print(str);
    }
    
}
