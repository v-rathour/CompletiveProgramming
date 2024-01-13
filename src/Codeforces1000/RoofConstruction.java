package Codeforces1000;

import java.util.Scanner;

public class RoofConstruction {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int m = n-1;

        int c = 0;
        while(m!=0){
            c++;
            m /= 2;
        }

        int j = (int)Math.pow(2,c-1);

        for (int i = n-1; i >=j; i--) {
            System.out.print(i+" ");
        }
        for (int i = 0; i < j; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

    }

}
