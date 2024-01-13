package Codeforces;

import java.util.*;

public class DecreasingString {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){
        int n = obj.nextInt();
        long ans = 0;

        for(int i = 0;i<n-1;i++){
            long num = obj.nextLong();
            ans += num;
        }
        System.out.println(-1*ans);
    }

//    public static void solve(Scanner obj){
//
//        String s = obj.next();
//        long idx = obj.nextLong();
//       int n = s.length();
//       Stack<Integer> st = new Stack<>();
//       int arr[] = new int[n+1];
//
//       int ind = n;
//
//        for (int i = 0; i < n; i++) {
//            while(!st.isEmpty() && s.charAt(st.peek())>s.charAt(i)){
//                int temp = st.pop();
//                arr[temp] = ind--;
//            }
//            st.push(i);
//        }
//
//        while(!st.isEmpty()){
//            int temp = st.pop();
//            arr[temp] = ind--;
//        }
//
//        int left = n;
//        for (int i = n; i >= 1; i--) {
//            left = i;
//            if(idx <=i)
//                break;
//            idx -= i;
//        }
//
//        for (int i = 0; i < n; i++) {
//            if(arr[i]>left)
//                continue;
//            idx--;
//            if(idx == 0){
//                System.out.print(s.charAt(i));
//            }
//        }



}



