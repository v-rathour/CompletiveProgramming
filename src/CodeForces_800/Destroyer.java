package CodeForces_800;

import java.util.HashMap;
import java.util.Scanner;

public class Destroyer {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = obj.nextInt();
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
            max = Math.max(max,num);
        }
//        System.out.println(map);
        for (int i = 1; i <=max; i++) {

            if(!map.containsKey(i)){
                System.out.println("NO");
                return;
            }
            else{
                if(!map.containsKey(i-1)){
                    System.out.println("NO");
                    return;
                }
                else if(map.get(i)>map.get(i-1)){
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }

}
