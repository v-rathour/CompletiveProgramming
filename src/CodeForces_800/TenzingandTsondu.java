package CodeForces_800;

import java.util.Scanner;

public class TenzingandTsondu {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
              solve(obj);
        }
    }

    public static void solve(Scanner obj){
        int n = obj.nextInt();
        int m = obj.nextInt();

        int tsonda = 0;
        for (int i = 0; i < n; i++) {
            tsonda += obj.nextInt();
        }

        int tenzing = 0;
        for (int i = 0; i < m; i++) {
            tenzing += obj.nextInt();
        }

        if(tsonda == tenzing){
            System.out.println("Draw");
        }
        else if(tsonda > tenzing){
            System.out.println("Tsondu");
        }
        else{
            System.out.println("Tenzing");
        }

        return;
    }
}
