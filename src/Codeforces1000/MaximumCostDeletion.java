package Codeforces1000;

import java.util.Scanner;

public class MaximumCostDeletion {

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

        String s = obj.next();

        if(b<0){

            int count = 1;
            for (int i = 1; i <n ; i++) {
                if(s.charAt(i) != s.charAt(i-1))
                    count++;
            }

            System.out.println(((a*n)+(b*((count/2)+1))));
        }
        else{
            long ans = 0;
            for (int i = 0; i < n; i++) {

                ans += (a+b);
            }
            System.out.println(ans);
        }

    }

}
