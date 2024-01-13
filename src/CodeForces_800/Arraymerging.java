package CodeForces_800;

import java.util.Scanner;

public class Arraymerging {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = obj.nextInt();
        }

        int a_sub[] = new int[(2*n)+1];
        int b_sub[] = new int[(2*n)+1];

        subArray(a,a_sub);
        subArray(b,b_sub);

        int sum = 0;
        for (int i = 0; i < 2*n+1; i++) {
            sum = Math.max(sum,a_sub[i]+b_sub[i]);
        }
        System.out.println(sum);

    }

    public static void subArray(int[] array,int subarray[]){

        int i = 0;
        int j = 0;
        int count = 0;

        while(i<array.length){

            while(j<array.length && array[i] == array[j]){

                j++;
                count++;

            }


            subarray[array[i]] = Math.max(count,subarray[array[i]]);
            i = j;
            count = 0;
        }


    }

}
