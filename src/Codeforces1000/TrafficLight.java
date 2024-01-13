package Codeforces1000;

import java.util.HashSet;
import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        char ch = obj.next().charAt(0);
        String s = obj.next();

        if(ch == 'g'){
            System.out.println(0);
        }else{
            int []left = new int[n];
            if(s.charAt(n-1) == 'g'){
                left[n-1] = n-1;
            }
            else{
                left[n-1] = -1;
            }

            for (int i = n-2; i>=0; i--) {
                if(s.charAt(i) == 'g'){
                    left[i] = i;
                }
                else{
                    left[i] = left[i+1];
                }
            }
            int ans = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if(ch == s.charAt(i)){
                    if(left[i] == -1){
                        ans = Math.max(ans,n-1-i+1+left[0]);
                    }
                    else{
                        ans = Math.max(ans,left[i] - i);
                    }
                }
            }

            System.out.println(ans);
        }

    }

}
