package Codeforces;

import java.util.Scanner;

public class MysteriousString {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }
    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int m = obj.nextInt();

        String str = obj.next();
        StringBuilder s = new StringBuilder(str);
        while(m-->0){
            int type = obj.nextInt();
            int start = obj.nextInt();
            int last = obj.nextInt();
            if(type == 1){
                int x = obj.nextInt();
            }

            boolean flag = palindrom(new StringBuilder(s.substring(start - 1, last)));
            if(flag){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

        }

    }

    public static boolean palindrom(StringBuilder s){
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

}
