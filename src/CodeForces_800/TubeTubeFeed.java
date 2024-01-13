package CodeForces_800;

import java.util.Scanner;

public class TubeTubeFeed {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }

    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int t = obj.nextInt();

        int[] second = new int[n];
        int[] interest = new int[n];

        for (int i = 0; i < n; i++) {
            second[i] = obj.nextInt();
        }

        for (int i = 0; i < n; i++) {
            interest[i] = obj.nextInt();
        }

        int ans = -1;
        int idx= -1;
        for (int i = 0; i < n; i++) {

            if(second[i] <= t-i && ans<interest[i]){
                ans = interest[i];
                idx = i+1;
            }

        }

        if(idx == -1){
            System.out.println("-1");
            return;
        }

        System.out.println(idx);

    }

}
