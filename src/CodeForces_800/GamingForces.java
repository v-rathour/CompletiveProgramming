package CodeForces_800;

import java.util.HashMap;
import java.util.Scanner;

public class GamingForces {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int one = 0;
        for (int i = 0; i < n; i++) {
            int num = obj.nextInt();
            if(num == 1){
                one++;
            }
        }
        int ans = one/2;
        if(one%2 == 1){
            ans++;
        }

        ans += (n-one);
        System.out.println(ans);

    }
}
