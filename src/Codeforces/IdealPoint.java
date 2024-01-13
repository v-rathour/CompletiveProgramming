package Codeforces;

import java.util.Scanner;

public class IdealPoint {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solution(obj);
        }
    }
    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int k = obj.nextInt();
        boolean start = false;
        boolean last = false;

        while(n-->0){

            int i = obj.nextInt();
            int j = obj.nextInt();

            if(i<=k && k<=j){
                if(i == k){
                    start = true;
                }

                if(j == k){
                    last=true;
                }
            }

        }

        if(start && last){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}
