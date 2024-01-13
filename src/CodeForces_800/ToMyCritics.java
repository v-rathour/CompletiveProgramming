package CodeForces_800;

import java.util.Scanner;

public class ToMyCritics {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        if(a+b >= 10 || a+c >= 10 || b+c >= 10){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

}
