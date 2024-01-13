package CodeForces_800;

import java.util.Scanner;

public class LittleElephant {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        int i = 0;
        for (; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch == '0'){
                break;
            }
        }

        if(i == s.length()){
            System.out.println(s.substring(0,s.length()-1));
            return;
        }

        System.out.println(s.substring(0,i)+""+s.substring(i+1));
    }

}
