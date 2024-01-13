package Codeforces1000;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BerlandMusic {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    static class Pair implements Comparable<Pair>{

        int val;
        int idx;

        public Pair(int val,int idx){
            this.val = val;
            this.idx = idx;
        }


        @Override
        public int compareTo(Pair o) {
            return this.val - o.val;
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        String s = obj.next();

        PriorityQueue<Pair> zeros = new PriorityQueue<>();
        PriorityQueue<Pair> ones = new PriorityQueue<>();

        for (int i = 0; i < s.length(); i++) {

             char ch = s.charAt(i);
             if(ch == '0'){
                 zeros.add(new Pair(arr[i],i));
             }
             else{
                 ones.add(new Pair(arr[i],i));
             }
        }

        int []ans = new int[n];
        int i = 0;
        while(!zeros.isEmpty()){

            Pair rem = zeros.remove();
            ans[rem.idx] = i+1;
            i++;
        }

        while(!ones.isEmpty()){
            Pair rem = ones.remove();
            ans[rem.idx] = i+1;
            i++;
        }

        for (int j = 0; j < n; j++) {
            System.out.print(ans[j]+" ");
        }
        System.out.println();



    }

}
