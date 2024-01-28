package Codeforces1000;

import java.util.*;
import java.util.Scanner;

public class TheGreatHero {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static class Pair implements  Comparable<Pair>{

        int a;
        int b;
        Pair(int a,int b){
            this.a = a;
            this.b = b;
        }
        @Override
        public int compareTo(Pair o) {
            return this.b-o.b;
        }
    }

    public static void solution(Scanner obj){

        int A = obj.nextInt();
        int B = obj.nextInt();
        int n = obj.nextInt();

        int []a = new int[n];
        int []b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = obj.nextInt();
        }

        Queue<Pair> q = new LinkedList<>() ;
        for (int i = 0; i < n; i++) {
            q.add(new Pair(a[i],b[i]));
        }

        while(!q.isEmpty()){
            Pair rem = q.remove();
            if(B<0){
                System.out.println("NO");
                return;
            }
            int temp = rem.b/A;
            rem.b -= (A*temp);
            int r = rem.b%A;
            if(r == 0 ){
                B -= (rem.a*temp);
            }
            else{
                temp++;
                if(B>=(rem.a*temp)){
                    B-= (rem.a*temp);
                }
                else{
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");

    }

}
