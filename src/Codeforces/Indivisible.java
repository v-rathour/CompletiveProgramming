package Codeforces;


import java.util.Scanner;

public class Indivisible {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            solution(sc);
        }
    }

    public static void solution(Scanner sc){

        int n = sc.nextInt();

        if(n == 1){
            System.out.println(1);
            return;
        }

        if(n%2 != 0){
            System.out.println(-1);
            return;
        }

        int idx = 0;
        int even = 2;
        int odd = 1;

        while(true){
            if(idx != n){
                System.out.print(even+" ");
                even += 2;
                idx++;
            }

            if(idx != n){
                System.out.print(odd+" ");
                odd += 2;
                idx++;
            }

            if(idx == n){
                break;
            }
        }
        System.out.println();

    }

}
