package CodeForces_800;

import java.util.Scanner;

public class ForbiddenInteger {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-- > 0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int k = obj.nextInt();
        int x = obj.nextInt();

        if(k == 1){
            System.out.println("NO");
        }
        else{
            if(x != 1){
                System.out.println("YES");
                System.out.println(n);
                for (int i = 0; i < n; i++) {
                    System.out.print("1 ");
                }
            }
            else{
                if(n%2 == 0){
                    System.out.println("YES");
                    System.out.println(n/2);
                    for (int i = 0; i < n/2; i++) {
                        System.out.print("2 ");
                    }
                }
                else{
                    if( k == 2){
                        System.out.print("NO");
                    }
                    else{
                        System.out.println("YES");
                        System.out.println(((n-3)/2)+1);
                        System.out.print("3 ");
                        for (int i = 0; i < (n-3)/2; i++) {
                            System.out.print("2 ");
                        }
                    }
                }
            }
        }

        System.out.println();

    }

}
