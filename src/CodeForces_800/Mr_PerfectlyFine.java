package CodeForces_800;

import java.util.Scanner;

public class Mr_PerfectlyFine {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();

        int zmin = Integer.MAX_VALUE;
        int omin = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int m = obj.nextInt();
            String s = obj.next();
            char ch1 = s.charAt(0);
            char ch2 = s.charAt(1);

            if(ch1 == '1' && ch2 == '1'){
                ans = Math.min(ans,m);
            }
            else if(ch1 == '1' && ch2 == '0'){
                zmin = Math.min(zmin,m);
            }
            else if(ch1 == '0' && ch2 == '1'){
                omin = Math.min(omin,m);
            }
        }

        if(ans != Integer.MAX_VALUE){
            if(zmin!= Integer.MAX_VALUE && omin != Integer.MAX_VALUE){
                ans = Math.min(ans,zmin+omin);
            }
            System.out.println(ans);
        }
        else if(zmin!= Integer.MAX_VALUE && omin != Integer.MAX_VALUE){
            System.out.println(zmin+omin);
        }
        else{
            System.out.println("-1");
        }


    }

}
