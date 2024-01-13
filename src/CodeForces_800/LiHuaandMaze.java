package CodeForces_800;

import java.util.Scanner;

public class LiHuaandMaze {

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

        int sr = obj.nextInt();
        int sc = obj.nextInt();
        int er = obj.nextInt();
        int ec = obj.nextInt();
        int ans = Integer.MAX_VALUE;

        if(sr == 1 || sr == r ){
            if(sc == 1 || sc == c ){
                ans = Math.min(ans,2);
            }
            else{
                ans = Math.min(ans,3);
            }
        }

        if(er == 1 || er == r){

            if( ec == 1 || ec == c){
                ans = Math.min(ans,2);
            }
            else{
                ans = Math.min(ans,3);
            }
        }

        if(sc == 1 || sc == c || ec == 1 || ec == c){
            ans = Math.min(ans,3);
        }

        ans = Math.min(ans,4);
        System.out.println(ans);

    }

}
