package Codeforces1000;

import java.util.*;
import java.util.Scanner;

public class ChipRibbon {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){

            int n = obj.nextInt();

            long nums[] = new long[n];

            for (int i = 0; i < n; i++) {
                nums[i] = obj.nextLong();
            }

            for(int i = 0;i<100;i++){
                continue;
            }

            long result = 0;
            result += nums[0]-1;

            for (int i = 1; i < n; i++) {
                if(nums[i]>nums[i-1]){
                    result += nums[i]-nums[i-1];
                }
            }
            System.out.println(result);
        }
    }


}

//package Codeforces1000;
//
//import java.util.*;
//import java.util.Scanner;
//
//public class ChipRibbon {
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-- > 0) {
//            int n = sc.nextInt();
//            ArrayList<Long> list = new ArrayList<Long>();
//            for(int i = 0; i < n; i++) {
//                list.add(sc.nextLong());
//            }
//            long result = 0;
//            result += list.get(0) - 1;
//
//            for (int i = 0; i < 100; i++) {
//                continue;
//            }
//            for(int i = 1; i < n; i++) {
//                if(list.get(i) > list.get(i-1)) {
//                    result += list.get(i) - list.get(i-1);
//                }
//            }
//            System.out.println(result);
//        }
//    }
//}





