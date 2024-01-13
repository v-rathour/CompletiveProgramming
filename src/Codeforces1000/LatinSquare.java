package Codeforces1000;

import java.util.HashSet;
import java.util.Scanner;

public class LatinSquare {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj) {

        StringBuilder a = new StringBuilder(obj.next());
        StringBuilder b = new StringBuilder(obj.next());
        StringBuilder c = new StringBuilder(obj.next());

        if (a.charAt(0) == '?' || b.charAt(0) == '?' || c.charAt(0) == '?') {

            HashSet<Character> set = new HashSet<>();
            if(a.charAt(0) != '?'){
                set.add(a.charAt(0));
            }

            if(b.charAt(0) != '?'){
                set.add(b.charAt(0));
            }

            if(c.charAt(0) != '?'){
                set.add(c.charAt(0));
            }

            String str = "ABC";
            for(int i = 0;i<3;i++){
                if(!set.contains(str.charAt(i))){
                    System.out.println(str.charAt(i));
                    return;
                }
            }

        } else if (a.charAt(1) == '?' || b.charAt(1) == '?' || c.charAt(1) == '?') {
            HashSet<Character> set = new HashSet<>();
            if(a.charAt(1) != '?'){
                set.add(a.charAt(1));
            }

            if(b.charAt(1) != '?'){
                set.add(b.charAt(1));
            }

            if(c.charAt(1) != '?'){
                set.add(c.charAt(1));
            }

            String str = "ABC";
            for(int i = 0;i<3;i++){
                if(!set.contains(str.charAt(i))){
                    System.out.println(str.charAt(i));
                    return;
                }
            }

        } else {
            HashSet<Character> set = new HashSet<>();
            if(a.charAt(2) != '?'){
                set.add(a.charAt(2));
            }

            if(b.charAt(2) != '?'){
                set.add(b.charAt(2));
            }

            if(c.charAt(2) != '?'){
                set.add(c.charAt(2));
            }

            String str = "ABC";
            for(int i = 0;i<3;i++){
                if(!set.contains(str.charAt(i))){
                    System.out.println(str.charAt(i));
                    return;
                }
            }
        }
    }
}
