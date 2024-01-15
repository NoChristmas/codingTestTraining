package Solving;

import java.util.*;
import java.io.*;

public class BOJ20923 {
    static int N, cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Deque<Integer> D = new LinkedList<>();
        Deque<Integer> S = new LinkedList<>();
        Deque<Integer> DG = new LinkedList<>();
        Deque<Integer> SG = new LinkedList<>();

        int games = Integer.parseInt(st.nextToken());
        int cards = Integer.parseInt(st.nextToken());
        
        //첫번째 값에 계속 추가 한다.
        for(int i = 0; i<cards; i++) {
            st = new StringTokenizer(br.readLine());
            D.addLast(Integer.parseInt(st.nextToken()));
            S.addLast(Integer.parseInt(st.nextToken()));
        }
        int fields = 0;
        for(int i =0; i<games; i++) {
            if(D.isEmpty()) { //둘중 하나의 카드가 오링났을 때
                System.out.println("su");
                break;
            }
            
            DG.addFirst(D.pollLast());
            fields = DG.getFirst();
            
            if(S.isEmpty()) {
                System.out.println("do");
                break;
            }
            SG.addFirst(S.pollLast());
            fields = SG.getFirst();

        }
        
        if(D.size() == S.size()) System.out.println("dosu");
        
    }
}
