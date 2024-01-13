package Codeforces1000;

import java.util.Scanner;

public class Vaccination {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t =obj.nextInt();

        while(t-->0){
            solution(obj);
        }

    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int k = obj.nextInt();
        int d = obj.nextInt();
        int w = obj.nextInt();

        int []arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = obj.nextInt();
        }

        int i = 0;
        int count = 0;
        while(i<n){

            int ele = arr[i];
            int first = ele+w;
            int last = first+d;

            int ans = findBest(arr,i,n-1,last);

            int temp = (ans-i+1);
            if(k>=temp){
                i = ans+1;
            }
            else{
                i = i+k;
            }
            count++;
        }

        System.out.println(count);
    }

    public static int findBest(int []arr,int i,int j,int target){
        int ans = -1;
        while(i<=j){
            int mid = (i+(j-i)/2);

            if(arr[mid]<=target){
                ans = mid;
                i = mid+1;
            }

            if(arr[mid]>target){
                j = mid-1;
            }

        }

        return ans;

    }

}
