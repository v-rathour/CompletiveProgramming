package CodeForces_800;

import java.util.Scanner;

public class InversionMagic {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        String s = obj.next();
        int i = 0;
        int j = n-1;
        int ans = 0;
        int flag = 0;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                flag = 0;
            }
            else{
                if(flag == 0){
                    ans++;
                }
                flag = 1;
            }
            i++;
            j--;
        }

        if(ans > 1){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

    }

}
