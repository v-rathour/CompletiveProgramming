package Codeforces;

import java.util.Scanner;

public class BrokenKeyboard {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        String s = obj.next();
        int pos = 1;

        for (int i = 0; i < n; i++) {

            if(pos%2 == 0){
                if(((s.length()-i-1)<1) || s.charAt(i) != s.charAt(i+1)){
                    System.out.println("NO");
                    return;
                }
                i++;
            }
            pos++;
        }
        System.out.println("YES");

    }

}
