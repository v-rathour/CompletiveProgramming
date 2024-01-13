package CodeForces_800;

import java.util.Scanner;

public class AleksaandStack {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(((i*2)-1)+" ");
        }
        System.out.println();


    }
}

