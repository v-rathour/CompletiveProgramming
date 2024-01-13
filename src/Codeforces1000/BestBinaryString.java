package Codeforces1000;

import java.util.Scanner;

public class BestBinaryString {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        String s = obj.next();
        int n = s.length();
        int i = 0;
        StringBuilder ans = new StringBuilder();
        while(i<n){
            int j = i;
            while(j<n && s.charAt(j) == '?' ){
                j++;
            }

            while(i<j){
                if(j == n || s.charAt(j) == '1'){
                    ans.append('1');
                }else{
                    ans.append('0');
                }
                i++;
            }

            if(j != n && j == i){
                ans.append(s.charAt(i));
            }

            i++;
        }

        System.out.println(ans.toString());

    }

}
