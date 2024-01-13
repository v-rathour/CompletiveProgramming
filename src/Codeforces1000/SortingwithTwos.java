package Codeforces1000;

import java.util.HashSet;
import java.util.Scanner;

public class SortingwithTwos {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }

    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int []nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = obj.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(8);
        set.add(16);

        for (int i = 1; i < n; i++) {
            if(nums[i-1]>nums[i]){
                if(!set.contains(i)){
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");

    }

}
