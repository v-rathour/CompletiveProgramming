package Codeforces;

import java.util.Scanner;

public class NumberofPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            solution(sc);
        }
    }

    public static void solution(Scanner sc){

        int n = sc.nextInt();
        int k = sc.nextInt();

        String s = sc.next();
        int lower[] = new int[26];
        int upper[] = new int[26];

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if(ch >= 65 && ch<=90){
                upper[ch-'A']++;
            }
            else{
                lower[ch-'a']++;
            }
        }

        int result = 0;

        for (int i = 0; i < 26; i++) {
             int small = lower[i];
             int capital = upper[i];

             int min = Math.min(small,capital);
             int max = Math.max(small,capital);

             result += min;
             int rem = max-min;
             int possibleburl = rem/2;

             if(possibleburl<k){
                 result += possibleburl;
                 k -= possibleburl;
             }
             else{
                 result += k;
                 k = 0;
             }


        }

        System.out.println(result);

    }

}
