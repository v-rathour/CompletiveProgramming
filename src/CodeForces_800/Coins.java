package CodeForces_800;

import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        long n = obj.nextLong();
        long k = obj.nextLong();

        if(k == 1){
            System.out.println("YES");
            return;
        }

        if(n%2 != 0 && k%2 == 0){
            System.out.println("NO");
            return;
        }

        System.out.println("YES");


    }

}
