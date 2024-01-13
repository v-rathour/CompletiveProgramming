package CodeForces_800;
//https://codeforces.com/problemset/problem/1833/A
import java.util.HashSet;
import java.util.Scanner;

public class MusicalPuzzle {

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
        HashSet<String> set = new HashSet<>();
        set.add(s.charAt(0)+""+s.charAt(1));
        int j = 1;
        for (int i = 2; i < n; i++) {
            char ch1 = s.charAt(j);
            char ch2 = s.charAt(i);
            set.add(ch1+""+ch2);
            j++;
        }

        System.out.println(set.size());

    }

}
