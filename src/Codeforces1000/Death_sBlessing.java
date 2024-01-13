package Codeforces1000;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Death_sBlessing {

    public static class Pair implements Comparable<Pair>{

        int val;
        int idx;

        public Pair(int val,int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair obj) {
            return this.val == obj.val?this.idx-obj.idx:this.val-obj.val;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        long totalhealt = 0;
        for (int i = 0; i < n; i++) {
           long health  = obj.nextLong();
           totalhealt += health;
        }
        long max = Long.MIN_VALUE;
        long totalspell = 0;
        for (int i = 0; i < n; i++) {
            long spell = obj.nextLong();
            totalspell += spell;
            max = Math.max(spell,max);

        }

        System.out.println(totalhealt+totalspell-max);



    }

}
