package Codeforces1000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Doremys_Paint_3 {

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
        HashSet<Integer>set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            nums[i] = obj.nextInt();
            set.add(nums[i]);
        }

        if(set.size() == 1){
            System.out.println("YES");
        }
        else if(set.size() == 2){

            Arrays.sort(nums);
            int first = 1;
            for (int i = 1; i < n; i++) {
                if(nums[i-1] != nums[i]){
                    break;
                }
                first++;
            }

            int second = n-first;
            if(Math.abs(first-second) >1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

        }else {
            System.out.println("NO");
        }




    }

}
