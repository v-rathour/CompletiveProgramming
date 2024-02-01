package Codeforces1000;

import java.util.HashSet;
import java.util.Scanner;

public class StringLCM {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){
        StringBuilder a = new StringBuilder(obj.next());
        StringBuilder b = new StringBuilder(obj.next());

        StringBuilder na = new StringBuilder(a);
        StringBuilder nb = new StringBuilder(b);

        while(na.length() != nb.length()){
            if(na.length()>nb.length()){
                nb.append(b);
            }
            else{
                na.append(a);
            }
        }

        for (int i = 0; i < nb.length(); i++) {
            if(nb.charAt(i) != na. charAt(i)){
                System.out.println("-1");
                return;
            }
        }

        System.out.println(nb);

    }

}
