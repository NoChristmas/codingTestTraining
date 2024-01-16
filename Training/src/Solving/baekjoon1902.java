package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++) {
            boolean flag = false;
            int num = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = N-1;
            int mid = (start+end)/2;
            while(start<=end) {
                mid = (start+end)/2;
                if(arr[mid] < num) {
                    start = mid + 1;
                } else if (arr[mid]> num) {
                    end = mid - 1;
                } else {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                sb.append(1+"\n");
            } else {
                sb.append(0+"\n");
            }
        }
        System.out.println(sb);
    }
}
