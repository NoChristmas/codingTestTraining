package Solving;

import java.util.*;
import java.io.*;

public class baekjoon10431 {
    static int[] arr;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i = 0; i<N; i++) {
            cnt = 0;
            arr = new int[20];
            st = new StringTokenizer(br.readLine());
            int testNum = Integer.parseInt(st.nextToken());
            for(int j = 0; j<20; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            selectSort();
            System.out.println(testNum + " " + cnt);
        }
    }

    public static void selectSort(){
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<i; j++) {
                if(arr[i] < arr[j]) {
                    cnt++;
                }
            }
        }
    } 
}
