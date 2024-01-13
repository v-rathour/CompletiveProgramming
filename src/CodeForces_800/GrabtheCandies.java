package CodeForces_800;

import java.util.Scanner;

public class GrabtheCandies {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            int num = obj.nextInt();
            if(num%2 == 0){
                even += num;
            }
            else{
                odd += num;
            }
        }

        if(even > odd){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }

}
