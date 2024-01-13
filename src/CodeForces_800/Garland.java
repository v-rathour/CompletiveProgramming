package CodeForces_800;

import java.util.*;

public class Garland {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        String s = obj.next();
        int arr[] =  new int[4];


        for(int i = 0;i<4;i++){
            arr[i]  = s.charAt(i)-'0';

        }
        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < 4; i++) {
            if(arr[i-1] != arr[i]){
                count++;
            }
        }

        if(count == 1){
            System.out.println("-1");
        }
        else if(count == 2 ){

            int freq = 0;
            for (int i = 0; i < 4; i++) {
                if(arr[0] == arr[i]){
                    freq++;
                }
            }
            int ans = ((freq%2 == 0)?4:6);
            System.out.println(ans);
        }
        else {
            System.out.println("4");
        }

    }

}
