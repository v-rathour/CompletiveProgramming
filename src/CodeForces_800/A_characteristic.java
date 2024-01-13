package CodeForces_800;

import java.util.Scanner;

public class A_characteristic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            solve(sc);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int k = obj.nextInt();

        for (int i = 0; i <= 100; i++) {
            int j = n-i;
            int tem = (i*(i-1))/2+(j*(j-1))/2;
            if(tem == k) {
                System.out.println("YES");
                for (int l = 1; l <= i; l++) {
                    System.out.print("1 ");
                }
                for (int l = 1; l <= n - i; l++) {
                    System.out.print("-1"+" ");
                }
                System.out.println();
                return;
            }
        }

        System.out.println("NO");

    }

}
