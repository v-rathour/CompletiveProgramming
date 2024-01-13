package CodeForces_800;

import java.util.Scanner;

public class CinemaLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    public static void solve(Scanner scanner){

        int n = scanner.nextInt();
        long twt = 0;
        long fty = 0;


        for (int i = 0; i < n; i++) {
            int ruble = scanner.nextInt();

            if(ruble == 50){
                fty++;
                if(twt >= 1){
                    twt--;
                }
                else{
                    System.out.println("NO");
                    return;
                }
            }
            else if(ruble == 25){
                    twt++;
            }
            else{

                if(fty>=1 && twt>=1){
                    fty--;
                    twt--;

                }
                else if(twt >= 3){
                    twt -= 3;
                }
                else{
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");

    }

}
