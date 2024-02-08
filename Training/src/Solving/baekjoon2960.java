package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[N+1];
        prime[0] = prime[1] = true;
        int cnt = 0;
        for(int i = 2; i<prime.length; i++) {
            if(prime[i]) continue;
                for(int j = i; j<prime.length; j+=i) {
                    if(!prime[j]) {
                        cnt++;
                        if(cnt == K) {
                            System.out.println(j);
                            return;
                        }
                    }
                prime[j] = true;
            }
        }
    }
}                
