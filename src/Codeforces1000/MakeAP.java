package Codeforces1000;

import java.util.Scanner;

public class MakeAP {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        if((b-a) == (c-b)){
            System.out.println("YES");
            return;
        }

        if((a+c)%(2*b) == 0){
            System.out.println("YES");
            return;
        }

        if(((2*b)-a)>0 && ((2*b)-a)%c == 0){
            System.out.println("YES");
            return;
        }

        if(((2*b)-c)>0 && ((2*b)-c)%a == 0){
            System.out.println("YES");
            return;
        }

        System.out.println("NO");

    }

}
