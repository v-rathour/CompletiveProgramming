package CodeForces_800;
import java.util.*;

public class SequenceGame {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextLong();
        }
        List<Long> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i = 1;i<n;i++){
            if(arr[i-1]<=arr[i]){
                result.add(arr[i]);
            }
            else{
                result.add((long)1);
                result.add(arr[i]);
            }
        }
        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i)+" ");
        }
        System.out.println();

    }

}
