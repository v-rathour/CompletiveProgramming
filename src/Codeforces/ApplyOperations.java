package Codeforces;

import java.util.Scanner;

//public class ApplyOperations {
//
//    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        solution(obj);
//    }
//    static int ans = Integer.MAX_VALUE;
//    public static void solution(Scanner obj){
//
//        String s1 = obj.next();
//        String s2 = obj.next();
//
//        int x = obj.nextInt();
//
//        StringsEqual(s1,s2,0,x,0);
//        System.out.println(ans);
//    }
//
//    public static void StringsEqual(String s1,String s2,int idx,int x,int op){
//
//        if(idx == s1.length()){
//            if(s1.equals(s2)){
//                ans = Math.min(ans,op);
//            }
//            return ;
//        }
//
//        if(s1.charAt(idx) != s2.charAt(idx)){
//            for (int i = idx+1; i < s1.length();i++) {
//                if(s1.charAt(i) != s2.charAt(i)){
//                    String left = s1.substring(0,idx);
//                    char ch = s1.charAt(idx) == '0'?'1':'0';
//                    String medium = s1.substring(idx+1,i);
//                    char ch1 = s1.charAt(i) == '0'?'1':'0';
//                    String right = s1.substring(i+1);
//                    StringsEqual(left+ch+medium+ch1+right,s2,i,x,op+x);
//                }
//            }
//            String left = s1.substring(0,idx);
//            char ch =  s1.charAt(idx) == '0'?'1':'0';
//            String right = s1.substring(idx+1);
//            StringsEqual(left+ch+right,s2,idx+1,x,op+1);
//
//
//        }
//
//    }
//
//}

public class ApplyOperations{

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int d = obj.nextInt();

        if(((a>b && c>d) || (a<b && c<d)) && ((a>c && b>d) || (a<c && b<d))  ){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}




