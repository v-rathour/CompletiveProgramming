package Codeforces1000;

import java.util.Scanner;

public class LukeisaFoodie {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int k = obj.nextInt();

        long []arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        long [][]map = new long[n][2];
        for (int i = 0; i < n; i++) {
            map[i][0] = arr[i]-k;
            map[i][1] = arr[i]+k;
        }

        int count = 0;
        long l = map[0][0];
        long r = map[0][1];
        for(int i = 0;i<n;i++){

            if(map[i][0]>r || map[i][1]<l){
                count++;
                l = map[i][0];
                r = map[i][1];
            }

            l = Math.max(l,map[i][0]);
            r = Math.min(r,map[i][1]);

        }

        System.out.println(count);

    }

}
