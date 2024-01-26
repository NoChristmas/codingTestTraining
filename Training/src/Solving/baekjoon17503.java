package Solving;

import java.util.*;
import java.io.*;

public class baekjoon17503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> q = new PriorityQueue<>();
        List<Beer> list = new ArrayList<>();
        for(int i = 0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list.add(new Beer(v,c));
        }
        list.sort(new Comparator<Beer>() {
            @Override
            public int compare(Beer o1, Beer o2) {
                if(o1.level == o2.level) {
                    return o2.like - o1.like;
                }
                return o1.level - o2.level;
            }
        });
        int total = 0; //선호도 합
        int answer = -1; //답
        for(int i =0; i<list.size(); i++) {
            Beer cur = list.get(i);
            q.add(cur.like);
            total += cur.like;
            if(q.size() > N) {
                total -= q.poll();
            }
            if(q.size() == N && total >= M) {
                answer = cur.level;
                break;
            }
        }
        System.out.println(answer);
    }

    static class Beer  {
        int like;
        int level;
        public Beer(int like, int level) {
            this.like = like;
            this.level = level;
        }
    }
}
