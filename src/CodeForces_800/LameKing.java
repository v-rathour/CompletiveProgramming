package CodeForces_800;

import java.util.Scanner;

public class LameKing {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int r = obj.nextInt();
        int c = obj.nextInt();

        r = Math.abs(r);
        c = Math.abs(c);

        int ans = 2*Math.min(r,c);
        if(r != c){
            ans += 2*Math.abs(r-c)-1;
        }

        System.out.println(ans);

    }

}
