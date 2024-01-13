package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctSplit {

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

        int left[] = new int[n];
        int right[] = new int[n];

        HashSet<Character> set = new HashSet<>();
        int count = 0;
        int match = -1;
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if(!set.contains(ch)){
                count++;
                left[i] = count;
                set.add(ch);

            }
            else{
                if(match == -1){
                    match = i;
                }
                left[i] = count;
            }

        }

        set = new HashSet<>();
        count = 0;
        for (int i = s.length()-1; i >= 0; i--) {

            char ch = s.charAt(i);
            if(!set.contains(ch)){
                count++;
                right[i] = count;
                set.add(ch);

            }
            else{
                right[i] = count;
            }

        }
        int result = 0;

        if(match != -1){
            for (int i = 1; i < n; i++) {
                if(left[i-1] == left[i]){
                    result = Math.max(result,left[i-1]+right[i]);
                }
            }
            System.out.println(result);
            return;
        }

        System.out.println(left[n-1]);

    }
}
