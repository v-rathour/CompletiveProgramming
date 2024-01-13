package CodeForces_800;

import java.util.Scanner;

public class TheString {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        String s = obj.next();
        int idx = 0;


        for (int i = 1; i < n; i++) {
            char ch = s.charAt(i);

            if((s.charAt(idx)-'0') >= (ch-'0')){
                idx = i;
            }
        }

        String left = s.substring(0,idx);
        String right = s.substring(idx+1);
        System.out.println(s.charAt(idx)+left+right);

    }

}
