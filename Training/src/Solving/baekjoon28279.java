package Solving;

import java.util.*;
import java.io.*;

public class baekjoon28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N; i++) {
            String str = br.readLine();
            if(str.length() > 2) {
                StringTokenizer st = new StringTokenizer(str);
                st.nextToken();
                if(str.substring(0,1).equals("1")) {
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                } else {
                    dq.addLast(Integer.parseInt(st.nextToken()));
                }
                continue;
            }
            if(str.equals("3")) {
                if(!dq.isEmpty()) {
                    sb.append(dq.pollFirst()+"\n");
                    
                } else {
                    sb.append("-1"+"\n");
                }
            } else if (str.equals("4")) {
                if(!dq.isEmpty()) {
                    sb.append(dq.pollLast()+"\n");
                } else {
                    sb.append("-1"+"\n");
                    
                }
            } else if (str.equals("5")) {
                sb.append(dq.size()+"\n");
                
            } else if (str.equals("6")) {
                if(dq.isEmpty()) {
                    sb.append("1"+"\n");
                    
                } else {
                    sb.append("0"+"\n");
                    
                }
            } else if (str.equals("7")) {
                if(!dq.isEmpty()) {
                    sb.append(dq.peekFirst()+"\n");
                    
                } else {
                    sb.append("-1"+"\n");
                    
                }
            } else {
                if(!dq.isEmpty()) {
                    sb.append(dq.peekLast()+"\n");
                    
                } else {
                    sb.append("-1"+"\n");
                    
                }
            }
        }
        System.out.println(sb);
    }
}
