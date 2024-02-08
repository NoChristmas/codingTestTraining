package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        
        for(int i = 0; i<T; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
            dq.addLast(i+1);
        }
        
        int nextIdx = list.get(0);
        sb.append(dq.peekFirst()+" ");
        //1 2 3 4 5
        
        //2 3 4 5 1
        //3 4 5 1 2
        //4 5 1 2 3
        //3 4 5 2
        //4 5 2 3
        
        while(!dq.isEmpty()) {
            if(nextIdx >= 0) { //양수일 경우
                for(int j = 0; j < nextIdx-1; j++) {
                    dq.addLast(dq.pollFirst());
                }
                int curbal = dq.pollFirst();
                sb.append(curbal+" ");
                System.out.println(curbal);
                nextIdx = list.get(0);
                list.remove(0);
            } else { //음수일 경우
                for(int j = nextIdx; j < -1; j++) {
                    dq.addFirst(dq.pollLast());
                }
                int curbal = dq.pollFirst();
                sb.append(curbal+" ");
                System.out.println(curbal);
                nextIdx = list.get(0);
                list.remove(0);
            }
        }
    }
}