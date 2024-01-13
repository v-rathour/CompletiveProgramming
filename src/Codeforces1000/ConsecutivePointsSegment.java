package Codeforces1000;

import java.util.HashSet;
import java.util.Scanner;

public class ConsecutivePointsSegment {

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

       int []temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        int flag = 0;
        for (int i = 1; i < n; i++) {
            int diff = temp[i]-temp[i-1];
            if(diff == 0 || diff == 1 || diff == 2){
                temp[i] = temp[i-1]+1;
            }
            else{
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("YES");
            return;
        }

        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        flag = 0;
        temp[0] -= 1;
        for (int i = 1; i < n; i++) {
            int diff = temp[i]-temp[i-1];
            if(diff == 0 || diff == 1 || diff == 2){
                temp[i] = temp[i-1]+1;
            }
            else{
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("YES");
            return;
        }

        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        flag = 0;
        temp[0] += 1;
        for (int i = 1; i < n; i++) {
            int diff = temp[i]-temp[i-1];
            if(diff == 0 || diff == 1 || diff == 2){
                temp[i] = temp[i-1]+1;
            }
            else{
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");

    }

}
