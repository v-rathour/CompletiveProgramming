package Codeforces1000;

import java.util.*;
import java.util.Scanner;

public class PermutationMinimizationbyDeque {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            if(dq.isEmpty()){
                dq.addLast(temp);
            }
            else if(dq.peekFirst()>temp){
                dq.addFirst(temp);
            }
            else{
                dq.addLast(temp);
            }
        }

        while(!dq.isEmpty()){
            int rem = dq.removeFirst();
            System.out.print(rem+" ");
        }
        System.out.println();

    }

}
