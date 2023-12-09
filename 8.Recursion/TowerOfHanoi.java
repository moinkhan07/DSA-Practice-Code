public class TowerOfHanoi { // O(2n)

    public static void towerOfHanoi(int n,String src,String help,String dest) {
        if(n == 1){
            System.out.println("Transfer disk "+n+" from " +src+" to "+ dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, help);
        System.out.println("Transfer disk "+n+" from " +src+" to "+ dest);
        towerOfHanoi(n-1, help, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");

        /*
        Transfer disk 1 from S to D
        Transfer disk 2 from S to H
        Transfer disk 1 from D to H
        Transfer disk 3 from S to D
        Transfer disk 1 from H to S
        Transfer disk 2 from H to D
        Transfer disk 1 from S to D
        */
    }
    
}
