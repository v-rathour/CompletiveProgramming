package Codeforces1000;

import java.util.Scanner;

public class InfiniteReplacement {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int q = obj.nextInt();

        while(q-->0){

            solution(obj);

        }
    }

    public static void solution(Scanner obj){

        String s = obj.next();
        String t = obj.next();

        boolean flag = false;
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(ch == 'a'){
                flag = true;
            }
        }

        if(flag){
            if(t.length() == 1){
                System.out.println("1");
            }
            else{
                System.out.println("-1");
            }
        }
        else{

            long ans = (long)Math.pow(2,s.length());
            System.out.println(ans);

        }

    }

}
