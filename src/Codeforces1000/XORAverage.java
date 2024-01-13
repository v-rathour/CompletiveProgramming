package Codeforces1000;

import java.util.Scanner;

public class XORAverage {

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
            for (int i = 0; i < n; i++) {
                System.out.print(1+" ");
            }
        }
        else{
            System.out.print(1+" "+3+" ");
            for (int i = 2; i <n; i++) {
                System.out.print(2+" ");
            }
        }
        System.out.println();

    }

}
