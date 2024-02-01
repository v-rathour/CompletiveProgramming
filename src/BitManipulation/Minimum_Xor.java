package BitManipulation;

public class Minimum_Xor {

    public static void main(String[] args) {
        int a = 11;
        int b = 125;
        System.out.println(MIN_Val(a,b));
    }

    public static int MIN_Val(int a,int b){
        int c = CountSet(b);
        int x = 0;
        for(int i = 31;i>=0 && c>0;i--){
            if((a&(1<<i)) != 0){
                x += (1<<i);
                c--;
            }
        }

        for (int i = 0; i < 31 & c>0; i++) {
            if((a&(1<<i)) == 0){
                x += (1<<i);
                c--;
            }
        }

        return x;
    }

    private static int CountSet(int b) {
        int c = 0;
        while(b>0){
            c++;
            b = b&(b-1);
        }


        return c;
    }


}
