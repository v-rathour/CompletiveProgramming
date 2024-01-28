package BitManipulation;

public class Avengers_End_Game {

    public static void main(String[] args) {
        int []prime = {2,3,5};
        int n = 1000;

        System.out.println(Count(prime,n));

    }

    public static int Count(int [] prime ,int n){
        int len = prime.length;
        int ans = 0;

        for (int i = 1; i < (1<<len); i++) {
            if((FastCount(i)&1) != 0){
                ans += IntegerSection(prime,n,i);
            }
            else{
                ans -= IntegerSection(prime,n,i);
            }
        }

        return ans;
    }

    public static int IntegerSection(int []prime,int n,int i){
        int p = 1;
        int pos = 0;
        while(i>0){
            if((i&1) == 1){
                p *= prime[pos];
            }
            pos++;
            i>>=1;
        }

        return n/p;
    }

    public static int FastCount(int n){
        int count = 0;
        while(n>0){
            n = (n&(n-1));
            count++;
        }

        return count;
    }

}
