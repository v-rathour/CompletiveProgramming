package Codeforces1000;

import java.util.Scanner;

public class Raspberries {

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
        int ans = k;
        int ct = 0;

        for (int i = 0; i < n; i++) {
            int x = obj.nextInt();
            if(x%2 == 0){
                ct++;
            }

            if(x%k == 0){
                ans = 0;
            }

            ans = Math.min(ans,k-x%k);
        }

        if(k == 4){
            if(ct>=2){
                ans = 0;
            }
            else if(ct == 1){
                ans = Math.min(ans,1);
            }
            else{
                ans = Math.min(ans,2);
            }
        }

        System.out.println(ans);

    }

}
