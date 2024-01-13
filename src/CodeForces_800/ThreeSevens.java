package CodeForces_800;

import java.util.HashMap;
import java.util.*;

public class ThreeSevens {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int m = obj.nextInt();
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int n = obj.nextInt();

            for (int j = 0; j < n; j++) {

               int num = obj.nextInt();
               if(!map.containsKey(i)){
                   map.put(i,new ArrayList<>());
                   map.get(i).add(num);
               }
               else{
                   map.get(i).add(num);
               }

            }

        }

        HashSet<Integer> set = new HashSet<>();
        int []ans = new int[m];
        Arrays.fill(ans,-1);
        for (int i = m-1; i >=0 ; i--) {

            List<Integer> list = map.get(i);
            for (int j = 0; j < list.size(); j++) {

                int num = list.get(j);
                if(!set.contains(num)){

                    if(ans[i] == -1){
                        ans[i] = num;
                    }
                    set.add(num);

                }
                else{
                    set.add(num);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if(ans[i] == -1){
                System.out.println("-1");
                return;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }

}
