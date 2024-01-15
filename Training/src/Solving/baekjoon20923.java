package Solving;

import java.util.*;
import java.io.*;

public class baekjoon20923 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cards = Integer.parseInt(st.nextToken());
        int games = Integer.parseInt(st.nextToken());

        Deque<Integer> D = new LinkedList<>();
        Deque<Integer> S = new LinkedList<>();
        Deque<Integer> Ddeck = new LinkedList<>();
        Deque<Integer> Sdeck = new LinkedList<>();

        for(int i = 0; i<cards; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            D.add(A);
            S.add(B);
        }
        List<Integer> list = new LinkedList<>();
        int curNum = 0;
        for(int i = 0; i<games; i++) {
            //매턴 진사람 검사
            if(D.isEmpty()) {
                System.out.println("su");
                return;
            }
            if(S.isEmpty()) {
                System.out.println("do");
                return;
            }

            if(i%2 == 0) { //dodo 턴
                Ddeck.addLast(D.pollLast());
                list.add(Ddeck.peekLast());
                if(D.isEmpty()) {
                    System.out.println("su");
                    return;
                }
                //걍 5가 나오면 침
                curNum = list.get(list.size()-1);
                if(curNum == 5) {  
                    while(!Sdeck.isEmpty()){
                        D.addFirst(Sdeck.pollFirst());
                    }
                    while(!Ddeck.isEmpty()) {
                        D.addFirst(Ddeck.pollFirst());
                    }
                    list = new LinkedList<>();
                    continue;
                }
                curNum = 0;
                for(int j = list.size()-1; j>=0 && j>list.size()-3; j--) {
                    curNum += list.get(j);
                }
                if(curNum == 5 && list.size()>=2) {
                    while(!Ddeck.isEmpty()){
                        S.addFirst(Ddeck.pollFirst());
                    }
                    while(!Sdeck.isEmpty()) {
                        S.addFirst(Sdeck.pollFirst());
                    }
                    list = new LinkedList<>();
                }

            } else { //su 턴
                Sdeck.addLast(S.pollLast());
                list.add(Sdeck.peekLast());
                if(S.isEmpty()) {
                    System.out.println("do");
                    return;
                }
                
                curNum = list.get(list.size()-1);
                if(curNum == 5) {  
                    while(!Sdeck.isEmpty()){
                        D.addFirst(Sdeck.pollFirst());
                    }
                    while(!Ddeck.isEmpty()) {
                        D.addFirst(Ddeck.pollFirst());
                    }
                    list = new LinkedList<>();
                    continue;
                }
                curNum = 0;
                for(int j = list.size()-1; j>=0 && j>list.size()-3; j--) {
                    curNum += list.get(j);
                }
                if(curNum == 5 && list.size()>=2) {
                    while(!Ddeck.isEmpty()){
                        S.addFirst(Ddeck.pollFirst());
                    }
                    while(!Sdeck.isEmpty()) {
                        S.addFirst(Sdeck.pollFirst());
                    }
                    list = new LinkedList<>();
                }
                
            }
        }
        

        if(D.size() > S.size()) {
            System.out.println("do");
        } else if(D.size() < S.size()) {
            System.out.println("su");
        } else {
            System.out.println("dosu");
        }
    }
}
