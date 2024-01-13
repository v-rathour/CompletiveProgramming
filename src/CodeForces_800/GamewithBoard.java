package CodeForces_800;

import java.util.Scanner;

public class GamewithBoard {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-- >0 ){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        if(n>=5){
            System.out.println("Alice");
        }
        else{
            System.out.println("Bob");
        }
    }

}
