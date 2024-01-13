package CodeForces_800;

import java.util.Scanner;

public class JellyfishandGreenApple {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int p = obj.nextInt();
        int i = 0;
        int ans = 0;
        while(n != 0 && i<1000){

            if(n>=p){
                 n = n%p;
            }
            else{
                ans += n;
                n = n*2;
            }
            i++;
        }

        if(n == 0){
            System.out.println(ans);
        }
        else{
            System.out.println("-1");
        }
    }

}
