package Codeforces1000;

import java.util.Scanner;

public class ConstructiveForces {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        if(n%2 != 0){
            if(n == 3){
                System.out.println("NO");
            }
            else{
                int rem = n/2;
                System.out.println("YES");
                for (int i = 0; i < n/2; i++) {
                    System.out.print((rem-1)+" "+(rem*-1)+" ");
                }
                System.out.println(n/2-1);
            }

            return;
        }
        System.out.println("YES");
        for (int i = 0; i < n/2; i++) {
            System.out.print("1 -1 ");
        }
        System.out.println();
    }

}
