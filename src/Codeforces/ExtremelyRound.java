package Codeforces;

import java.util.*;
import java.util.Scanner;

public class ExtremelyRound {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1000000; i *= 10) {
            for (int j = 1; j < 10; j++) {
                list.add(i*j);
            }
        }
        int t = obj.nextInt();

        while(t-->0){
            int n = obj.nextInt();
            int ans = 0;
            for(int val : list){
                if(val<=n){
                    ans++;
                }
                else{
                    break;
                }
            }
            System.out.println(ans);

        }
    }

}
