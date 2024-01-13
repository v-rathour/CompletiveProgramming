package CodeForces_800;

import java.util.Scanner;

public class Grasshopper_on_a_Line {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int k = obj.nextInt();

        if(n%k == 0 ){
            System.out.println("2");
            int i = 1;
            while((n-i)%k == 0 && i%k == 0){
                i++;
            }

            System.out.println((n-i)+" "+i);
        }
        else{
            System.out.println("1");
            System.out.println(n);
        }
        return;
    }

}