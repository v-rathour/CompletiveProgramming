package Codeforces1000;

import java.util.HashSet;
import java.util.Scanner;

public class EveryoneLovestoSleep {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }


    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int H = obj.nextInt();
        int M = obj.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++){

            int h = obj.nextInt();
            int m = obj.nextInt();

            set.add(h*60+m);
        }

        int t = 0;
        while(!set.contains((H*60+M+t)%(24*60))){
            t++;
        }

        t %= (24*60);
        System.out.println(t/60 +" "+ t%60);
    }
}
