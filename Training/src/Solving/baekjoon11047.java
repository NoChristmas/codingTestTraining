package Solving;
import java.util.*;
import java.io.*;
public class baekjoon11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int cnt = 0;
        for(int i = 0; i<N; i++) {
            if(money >= list.get(i)) {
                cnt += money/list.get(i);
                money %= list.get(i);
            }
            if(money == 0) {
                System.out.println(cnt);
                break;
            }
        }
    }
}
