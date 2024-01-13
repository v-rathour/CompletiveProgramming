package Codeforces1000;

import java.util.HashSet;
import java.util.Scanner;

public class Stripes {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        String []s = new String[8];
        HashSet<Integer> index = new HashSet<>();

        for (int i = 0; i < s.length; i++) {
            String str = obj.next();
            s[i] = str;
            if(str.charAt(0) == 'R'){
               index.add(i);
            }
        }

        if(index.size() == 0){
            System.out.println("B");
        }
        else{
            int ans = Integer.MIN_VALUE;
            for (int indx : index) {
                int count = 0;
                String str = s[indx];
                for (int i = 0; i <8 ; i++) {
                    if(str.charAt(i) == 'R'){
                        count++;
                    }
                }
                ans = Math.max(ans,count);
            }

            if(ans == 8){
                System.out.println("R");
            }
            else{
                System.out.println("B");
            }
        }
    }


}
