package CodeForces_800;
import java.util.*;
public class Rudolph_and_Tic_Tac_Toe {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0 ){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        char arr[][] = new char[3][3];
        for (int i = 0; i < 3; i++) {
            String s = obj.next();
            for (int j = 0; j < 3; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        for(int i = 0;i<3;i++){
            if(arr[i][0] == '.')
                continue;
            int j = 0;
            for (; j < 2; j++) {
                if(arr[i][j] != arr[i][j+1]){
                    break;
                }
            }
            if(j == 2){
                System.out.println(arr[i][j]);
                return;
            }
        }

        for (int j = 0; j < 3; j++) {
            if(arr[0][j] == '.')
                continue;
            int i = 0;
            for (; i < 2; i++) {
                if(arr[i][j] != arr[i+1][j]){
                    break;
                }
            }
            if(i == 2){
                System.out.println(arr[i][j]);
                return;
            }

        }

        int i = 0;
        for (; i < 2; i++) {
            if(arr[i][i] != arr[i+1][i+1] || arr[0][0] == '.'){
                break;
            }
        }

        if(i == 2){
            System.out.println(arr[0][0]);
            return;
        }

        int j = 2;
        for (int k = 0; k < 2; k++) {
            if(arr[k][j] != arr[k+1][j-1] || arr[0][2] == '.'){
                break;
            }
            j--;
        }
        if(j == 0){
            System.out.println(arr[0][2]);
            return;
        }

        System.out.println("DRAW");


    }


}
