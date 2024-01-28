package Codeforces;

import java.util.Scanner;

public class AdjacentMatrix {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){
        int n = obj.nextInt();
        int last = (int)Math.pow(n,2);

        if(n == 1){
            System.out.println("1");
            return;
        }

        if(n == 2){
            System.out.println(-1);
            return;
        }

        int count = 0;
        int j = 0;
        for(int i = 1;i<=last;i+=2){
            System.out.print(i+" ");
            j++;
            count++;
            if(count%n == 0){
                System.out.println();
            }
        }

        for (int i = 2; i <= last; i+=2) {
            System.out.print(i+" ");
            j++;
            count++;
            if(count%n == 0){
                System.out.println();
            }
        }


    }

}
