package Codeforces1000;

import java.util.Scanner;

public class ChessTournament {

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

        int ones = 0;
        int twos = 0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == '1'){
                ones++;
            }
            else{
                twos++;
            }
        }

        if(twos == 1 || twos == 2){
            System.out.println("NO");
            return;
        }

        int x = 1;
        char [][]ans = new char[n][n];
        for(int i = 0;i<n;i++){
            x = 1;
            for(int j = i;j<n;j++){
                if(i ==j){
                    ans[i][j] = 'X';
                }
                else if(s.charAt(i) == '1'){
                    ans[i][j] = '=';
                    ans[j][i] = '=';
                }
                else{
                    if( x == 1 && s.charAt(j) == '2'){
                        ans[i][j] = '+';
                        ans[j][i] = '-';
                        x = 2;
                    }
                    else{
                        ans[i][j] = '-';
                        ans[j][i] = '+';
                    }
                }
            }
        }

        System.out.println("YES");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }

}
