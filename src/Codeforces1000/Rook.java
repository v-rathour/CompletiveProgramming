package Codeforces1000;

import java.util.HashMap;
import java.util.Scanner;

public class Rook {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        
        while(t-->0){
            solution(obj);
        }
    }


    public static void solution(Scanner obj){

        String s = obj.next();
        char ro = s.charAt(0);
        char col = s.charAt(1);
        int n = col-'0';
        for(int i =1;i<9;i++) {
            if(i!=n)
                System.out.println(ro+""+i);

        }
        String vow ="abcdefgh";
        
        for(int i =0;i<vow.length();i++) {
            if(ro!=vow.charAt(i))
                System.out.println(vow.charAt(i)+""+col);

        }
    }

}
