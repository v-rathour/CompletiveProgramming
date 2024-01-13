package Codeforces1000;

import java.util.Scanner;

public class SpecialPermutation {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int a = obj.nextInt();
        int b = obj.nextInt();

        int first = a>b?n-b-1:n-b;
        int second = a>b?a-2:a-1;

        int half = n/2;
        if(first>=half || second>=half){
            System.out.println("-1");
            return;
        }

        int max = Math.max(a,b);
        int min = Math.min(a,b);



        if(a>b){
            for (int i = max; i <=n; i++) {
                System.out.print(i+" ");
            }
            for (int i = 1; i <=min ; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        else{
            for (int i = max+1; i <=n; i++) {
                System.out.print(i+" ");
            }
            for (int i = min; i <=max ; i++) {
                System.out.print(i+" ");
            }
            for (int i = 1; i < min; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
