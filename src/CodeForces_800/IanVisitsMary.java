package CodeForces_800;

import java.util.Scanner;

public class IanVisitsMary {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){

            solve(obj);

        }

    }

    public static void solve(Scanner obj){

        int p = obj.nextInt();
        int q = obj.nextInt();

        System.out.println("2");
        System.out.println(p-1+" "+"1");
        System.out.println(p+" "+q);

    }
}
