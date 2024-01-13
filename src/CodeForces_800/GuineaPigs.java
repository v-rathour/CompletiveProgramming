package CodeForces_800;

import java.util.Scanner;

public class GuineaPigs {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            Solution(obj);
        }
    }

    public static void Solution(Scanner obj){

        int n = obj.nextInt();
        int ans = 0;
        int c1 = 0,c2 = 0;

        for (int i = 0; i < n; i++) {
            int num = obj.nextInt();

            if(num == 2){
                int req = (c2 == 0)?0:c2/2+1;
                c1 = ans - req;
            }
            else{
                c2++;
                if(c1>0){
                    c1--;
                }
                else{
                    ans++;
                }
            }
        }
        System.out.println(ans);

    }

}
