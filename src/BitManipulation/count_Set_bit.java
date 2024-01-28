package BitManipulation;

public class count_Set_bit {

    public static void main(String[] args) {
        int n = 67;
        FastCount(n);
    }

    public static void FastCount(int n){
        int count = 0;
        while(n>0){
            n = (n&(n-1));
            count++;
        }

        System.out.println(count);
    }

}
