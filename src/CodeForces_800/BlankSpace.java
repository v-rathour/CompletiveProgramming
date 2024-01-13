package CodeForces_800;

import java.util.Scanner;

public class BlankSpace {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }

    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int zero = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int num = obj.nextInt();
            if(num == 1 ){
                ans = Math.max(ans,zero);
                zero = 0;
            }
            else{
                zero++;
            }
        }
        ans = Math.max(ans,zero);
        System.out.println(ans);

    }

}
