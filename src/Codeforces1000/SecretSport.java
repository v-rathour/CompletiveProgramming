package Codeforces1000;

import java.util.Scanner;

public class SecretSport {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }


    public static void solution(Scanner obj){
        int n = obj.nextInt();

        String s = obj.next();

        if(s.charAt(n-1) == 'A'){
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }

    }
}
