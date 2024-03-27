package Solving;

import java.util.*;
import java.io.*;

public class baekjoon10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push")) {
                dq.addLast(Integer.parseInt(st.nextToken()));
            } else if (str.equals("top")) {
                if(dq.isEmpty()) {
                    sb.append(-1+"\n");
                } else {
                    sb.append(dq.peekLast()+"\n");
                }
            } else if (str.equals("size")) {
                sb.append(dq.size()+"\n");
            } else if (str.equals("empty")) {
                if(dq.isEmpty()) {
                    sb.append(1+"\n");
                } else {
                    sb.append(0+"\n");
                }
            } else if (str.equals("pop")) {
                if(!dq.isEmpty()) {
                    sb.append(dq.pollLast()+"\n");
                } else {
                    sb.append(-1+"\n");
                }
            }
        }

        System.out.println(sb);
    }
}
