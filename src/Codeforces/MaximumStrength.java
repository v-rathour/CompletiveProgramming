package Codeforces;

import java.util.Scanner;

public class MaximumStrength {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            solve(sc);
        }
    }

    public static void solve(Scanner sc){

        String str1 = sc.next();
        String str2 = sc.next();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int n = str1.length();
        int m = str2.length();

        for (int i = 0; i < n; i++) {
            sb1.append(str1.charAt(i));
        }

        for (int i = 0; i < m; i++) {
            sb2.append(str2.charAt(i));
        }
        if(str1.equals(str2)){
            System.out.println("0");
            return;
        }

        if(sb1.charAt(0) == sb2.charAt(0) && n == m){
            long answer = 0;
            int i = 0;
            int flag = 0;
            while(i<n){

                if(flag == 1){
                    answer += 9;
                }
                else if(Integer.parseInt(sb1.charAt(i)+"") == Integer.parseInt(sb2.charAt(i)+"")){
                    answer += 0;
                }
                else{
                    answer += Math.abs(Integer.parseInt(sb1.charAt(i)+"")-Integer.parseInt(sb2.charAt(i)+""));
                    flag = 1;
                }
                i++;
            }

            System.out.println(answer);
            return;
        }


        long answer = 0;
        if(n != m){
            answer += Integer.parseInt(sb2.charAt(0)+"");
        }
        else{
            answer += Math.abs((Integer.parseInt(sb2.charAt(0)+"")-Integer.parseInt(sb1.charAt(0)+"")));
        }
        for (int i = 1; i < m; i++) {
            answer += 9;
        }

        System.out.println(answer);
    }

}
