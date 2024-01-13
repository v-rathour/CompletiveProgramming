package CodeForces_800;

import java.util.Scanner;

public class MorningSandwich {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-- > 0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){
        int b = obj.nextInt();
        int c = obj.nextInt();
        int h = obj.nextInt();

        int middle = c+h;
        middle -= 1;
        b -= 2;
        int ans = 3;

        ans += Math.min(middle,b)*2;
        System.out.println(ans);
    }

}
