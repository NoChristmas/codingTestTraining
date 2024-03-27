package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        Deque<Integer> dq = new LinkedList<>();
        
    
        for(int i = 1; i<=len; i++) {
            dq.addLast(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i = 0; i<len; i++) {
            for(int j = 0; j<num-1; j++) dq.addLast(dq.pollFirst());
            sb.append(dq.pollFirst()+", ");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        sb.append(">");
        
        System.out.println(sb);
    }
}
