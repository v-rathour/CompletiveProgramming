package Codeforces;

import java.util.Scanner;

public class ComeTogether {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }

    }


    public static void solve(Scanner obj){

        long ac = obj.nextLong();
        long ar = obj.nextLong();

        long bc = obj.nextLong();
        long br = obj.nextLong();

        long cc = obj.nextLong();
        long cr = obj.nextLong();

        long blc = ac - bc;
        long blr = ar - br;

        long clc = ac - cc;
        long clr = ar - cr;

        long ans = 0;
        if((blr<0 && clr<0) || (blr>=0 && clr>=0)){
            ans += Math.min(Math.abs(blr),Math.abs(clr));
        }

        if((blc<0 && clc<0) || (blc>=0 && clc>=0)){
            ans += Math.min(Math.abs(blc),Math.abs(clc));
        }

        ans += 1;

        System.out.println(ans);

    }
}
