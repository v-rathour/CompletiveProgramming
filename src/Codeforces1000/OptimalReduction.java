package Codeforces1000;

import java.util.*;

//public class OptimalReduction {
//
//    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        int t = obj.nextInt();
//
//        while(t-->0){
//            solution(obj);
//        }
//    }
//
//    public static void solution(Scanner obj){
//
//        int n = obj.nextInt();
//        long []arr = new long[n];
//
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = obj.nextLong();
//        }
//
//        int inc = 0;
//        int dec = 0;
//        int flag = 0;
//        for (int i = 1; i < n; i++) {
//            if(arr[i]>arr[i-1]){
//                if(dec == 0){
//                    inc++;
//                }
//                else{
//                    flag = 1;
//                    break;
//                }
//            }
//            else if(arr[i]<arr[i-1]){
//                dec++;
//            }
//        }
//
//        if(flag == 0){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }
//    }
//
//}



public class OptimalReduction {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);

        int m_hori_cons = 0;
        int m_vert_cons = 0;

        int Length = hBars.length;

        if (Length != 0)
            m_hori_cons = 1;

        int lent = vBars.length;

        if (lent != 0)
            m_vert_cons = 1;

        int count = 1;

        for (int i = 0; i < Length - 1; i++) {
            int inc = hBars[i] + 1;
            if (hBars[i + 1] == inc) {
                count++;
                if (count > m_hori_cons) {
                    m_hori_cons = count;
                }
            } else {
                count = 1;
            }
        }
        count = 1;
        for (int i = 0; i < lent - 1; i++) {
            int inc = vBars[i] + 1;
            if (vBars[i + 1] == inc) {
                count++;
                if (count > m_vert_cons) {
                    m_vert_cons = count;
                }
            } else {
                count = 1;
            }
        }

        //calculate the answer
        int result = 1;

        if (m_vert_cons > 0)
            m_vert_cons++;
        if (m_hori_cons > 0)
            m_hori_cons++;

        if (m_vert_cons < m_hori_cons) {
            result = m_vert_cons;
        } else {
            result = m_hori_cons;
        }

        for (int i = 0; i < 100; i++) {
            continue;
        }

        if (m_vert_cons > 0 && m_hori_cons > 0) {

            return result * result;

        } else if (m_vert_cons > 0 && m_hori_cons == 0) {

            if (lent == 1) {
                return 4;
            } else {
                return 1;
            }

        } else if (m_vert_cons == 0 && m_hori_cons > 0) {

            if (Length == 1) {
                return 4;
            } else {
                return 1;
            }

        }

        for (int i = 0; i < 100; i++) {
            continue;
        }

        return 1;
    }
}
