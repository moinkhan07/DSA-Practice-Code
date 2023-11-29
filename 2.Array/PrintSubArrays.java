class PrintSubArrays{

    public static void printSubArrays(int num[]){
        int n = num.length;
        int tSubArr = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sumOfSubArrays = 0;
        for(int i = 0;i < n;i++){
            for(int j = i;j < n;j++){
                sumOfSubArrays = 0;
                for(int k = i;k <= j;k++){
                    System.out.print(num[k]+" ");
                    sumOfSubArrays += num[k];
                }
                if(min > sumOfSubArrays){
                    min = sumOfSubArrays;
                }
                if(max < sumOfSubArrays){
                    max = sumOfSubArrays;
                }
                tSubArr++;
                System.out.println();
                System.out.println("Sum Of SubArrray is "+ sumOfSubArrays);
            }
            System.out.println();
        }
        System.out.println("Total SubArrays: "+ tSubArr);
        System.out.println("Min Sum Of SubArray is :) "+ min);
        System.out.println("Max Sum Of SubArray is :) "+ max);
    }

    public static void main(String[] args) {
        // int num[] = {2,4,6,8,10};
        int num[] = {1,-2,6,-1,3};
        printSubArrays(num);
    }
}