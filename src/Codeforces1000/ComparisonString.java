package Codeforces1000;

import java.util.Scanner;

public class ComparisonString {

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

        int MLT = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == '>'){
                count++;
            }
            else{
                count = 0;
            }
            MLT = Math.max(count,MLT);
        }

        int MGT = 0;
        count = 0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == '<'){
                count++;
            }
            else{
                count = 0;
            }
            MGT = Math.max(count,MGT);
        }

        int ans = Math.max(MGT,MLT);
        System.out.println(ans+1);

    }

}
