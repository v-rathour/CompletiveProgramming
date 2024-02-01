package Codeforces1000;

import java.util.Scanner;

public class NewYear_sNumber {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int quotient = n/2020;
        int remainder = n%2020;

        if(remainder<=quotient){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }

}
