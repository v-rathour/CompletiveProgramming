package CodeForces_800;
import java.util.*;
public class HungrySequence {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        boolean prime[] = isPrime();
        solve(prime,obj);
    }

    public static void solve(boolean[] isPrime,Scanner obj){

        int n = obj.nextInt();
        int count = 0;
        for (int i = 2; i < isPrime.length; i++) {

            if(isPrime[i]){
                System.out.print(i+" ");
                count++;
            }

            if(count == n){
                break;
            }

        }

    }

    public static boolean[] isPrime() {
        int n = 10000000; // 10^9
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;

    }

}
