package CodeForces_800;

import java.util.Scanner;

public class FollowingDirections {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        String s = obj.next();
        int row = 0;
        int col = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if(ch == 'U'){
                row++;
            }

            if(ch == 'L'){
                 col--;
            }
            if(ch == 'R'){
                col++;
            }
            if(ch == 'D'){
                row--;
            }

            if(row == 1 && col == 1){
                System.out.println("YES");
                return;
            }

        }

        System.out.println("NO");

    }

}
