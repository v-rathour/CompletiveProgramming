package Codeforces1000;

import java.util.Scanner;

public class BadBoy {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int m = obj.nextInt();
        int x = obj.nextInt();
        int y = obj.nextInt();

        if(x == 1 || x == n){
            if(x == 1){
                System.out.println(n+" "+1+" "+n+" "+m);
            }
            else{
                System.out.println(1+" "+1+" "+1+" "+m);
            }
            return;
        }

        if(y == 1 || y == m){
            if(y == 1){

                System.out.println(1+" "+m+" "+n+" "+m);
            }
            else{
                System.out.println(1+" "+1+" "+n+" "+1);
            }

            return;
        }
        System.out.println(1+" "+1+" "+n+" "+m);

    }

}
