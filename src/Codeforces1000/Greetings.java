package Codeforces1000;

import java.util.*;
import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solution(obj);
        }
    }

    public static class Pair implements Comparable<Pair>{

        int s;
        int e;
        public Pair(int s,int e){
            this.s = s;
            this.e = e;
        }
        @Override
        public int compareTo(Pair obj) {
            return this.s-obj.s;
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int []a = new int[n];
        int []b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
            b[i] = obj.nextInt();
        }


        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(new Pair(a[i],b[i]));
        }

        int []wight = new int[n];
        int i = 0;
        while(!pq.isEmpty()){
            Pair rem = pq.remove();
            wight[i] = rem.e;
            i++;
        }
        ans = new int[n];
        countSmallerToRight(wight);

        long result = 0;
        for (int j = 0; j < n; j++) {
            result += ans[j];
        }
        System.out.println(result);
    }

    static int[] ans;

    private static void countSmallerToRight(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Arrays.binarySearch(sortedArr, arr[i]) + 1;
        }
        int n = arr.length;

        FenwickTree fenwickTree = new FenwickTree(n);

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = fenwickTree.query(arr[i] - 1);
            fenwickTree.update(arr[i], 1);
        }
    }

    static class FenwickTree {
        private int[] BIT;
        private int size;

        public FenwickTree(int size) {
            this.BIT = new int[size + 1];
            this.size = size;
        }

        public void update(int index, int value) {
            while (index <= size) {
                BIT[index] += value;
                index += index & -index;
            }
        }

        public int query(int index) {
            int result = 0;
            while (index > 0) {
                result += BIT[index];
                index -= index & -index;
            }
            return result;
        }
    }



}
