package Codeforces1000;

import java.util.HashSet;
import java.util.Scanner;

public class PowerWalking {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(obj.nextInt());
        }

        int []arr = new int[n];
        for (int i = 1; i <=n ; i++) {
            if(set.size()>i){
                arr[i-1] = set.size();
            }
            else{
                arr[i-1] = i;
            }
        }

        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
