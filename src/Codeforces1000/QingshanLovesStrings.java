package Codeforces1000;

import java.util.Scanner;

public class QingshanLovesStrings {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int m = obj.nextInt();

        String s = obj.next();
        String t = obj.next();

        int flag = 0;
        for (int i = 1; i < n; i++) {
            if(s.charAt(i-1) == s.charAt(i)){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            int i = 1;
            for (; i < t.length(); i++) {
                if(t.charAt(i-1) == t.charAt(i)){
                    break;
                }
            }

            if((i != m) || (m>1 && (t.charAt(0) != t.charAt(m-1)))){
                System.out.println("NO");
                return;
            }

            char ch = t.charAt(0);
            for (int j = 1; j < n; j++) {
                if(s.charAt(j-1) == s.charAt(j)){
                    if(ch == s.charAt(j)){
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }

        System.out.println("YES");
    }
}
