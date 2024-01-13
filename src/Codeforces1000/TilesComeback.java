package Codeforces1000;

import java.util.Scanner;

public class TilesComeback {

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

        int []nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = obj.nextInt();
        }



        if(nums[0] == nums[n-1]){
            int count = 0;
            for (int i = 0; i < n; i++) {
                if(nums[i] == nums[0]){
                    count++;
                }

                if(count%k == 0){
                    System.out.println("YES");
                    return;
                }
            }

            System.out.println("NO");
        }
        else{
            int start = 0;
            int sidx = -1;
            int first = nums[0];
            for (int i = 0; i < n; i++) {
                if(first == nums[i]){
                    start++;

                }
                if(start == k){
                    sidx = i;
                    break;
                }
            }

            int last = 0;
            int lidx = n;
            int lele = nums[n-1];
            for (int i = n-1; i >=0; i--) {
                if(lele == nums[i]){
                    last++;

                }
                if(last == k){
                    lidx =i;
                    break;
                }
            }

            if(sidx != -1 && lidx != n && sidx<lidx){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }


    }

}
