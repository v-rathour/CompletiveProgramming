package CodeForces_800;

import java.util.HashSet;
import java.util.Scanner;

public class GoodArrays {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(obj.nextInt());
        }

        if(set.size() == n && n != 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

}
