package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cards = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[cards];
        for(int i = 0; i<cards; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int adj = 0;
        int temp = Integer.MAX_VALUE;
        int res = 0;
        for(int i = 0; i<cards-2; i++) {
            adj = arr[i];
            for(int j = i+1; j<cards-1; j++) {
                adj += arr[j];
                for(int k = j+1; k<cards; k++) {
                    adj += arr[k];
                    if(Math.abs(adj-target) < temp && target-adj >= 0) {
                        temp = Math.abs(adj-target);
                        res = adj;
                    }
                    adj -= arr[k];
                }
                adj -= arr[j];
            }
        }
        System.out.println(res);
    }
}
