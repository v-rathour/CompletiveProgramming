package CodeForces_800;

import java.util.Scanner;

public class PrependandAppend {

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

        int i = 0;
        int j = s.length()-1;
        while(i<j){

            char start = s.charAt(i);
            char end = s.charAt(j);
            if(start == end){
                break;
            }
            i++;
            j--;
        }

        System.out.println(j-i+1);

    }

}
