package Codeforces1000;

import java.util.Scanner;

public class Ugu {

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

        int i = 0;
        for (; i < n; i++) {
            if(s.charAt(i) == '1'){
                break;
            }
        }

        if(i == n){
            System.out.println("0");
        }
        else{
            int ans = 0;
            for (int j = i; j <n-1; j++) {
                if(s.charAt(j) != s.charAt(j+1)){
                    ans++;
                }
            }

            System.out.println(ans);
        }

    }

}
