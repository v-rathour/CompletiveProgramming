package CodeForces_800;

import java.util.Scanner;

public class TargetPractice {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }

    }

    public static void solve(Scanner obj){

        char arr[][] = new char[10][10];

        for (int i = 0; i < 10; i++) {
            String str = obj.next();
            for (int j = 0; j < 10; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        long max = 0;
        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (int j = i; j < 10-i; j++) {
                if(arr[i][j] == 'X'){
                    count++;
                }

                if(arr[9-i][j] == 'X'){
                    count++;
                }

                if(j > i && j < 9-i){
                    if(arr[j][i] == 'X'){
                        count++;
                    }

                    if(arr[j][9-i] == 'X'){
                        count++;
                    }
                }
            }
            max += (count*(i+1));

        }

        System.out.println(max);

    }

}
