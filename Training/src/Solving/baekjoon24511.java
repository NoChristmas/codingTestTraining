package Solving;

import java.util.*;
import java.io.*;

public class baekjoon24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[] arr = new int[T];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<T; i++) {
            arr[i] = (Integer.parseInt(st.nextToken()));
        }
        Deque<Integer> dq = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<T; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(arr[i] == 0) dq.addLast(a);    
        }

        int num = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<num; i++) {
            int number = Integer.parseInt(st.nextToken());
            dq.addFirst(number);
            sb.append(dq.pollLast()+" ");
        }
        System.out.println(sb);
    }
}
