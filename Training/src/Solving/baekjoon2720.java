package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] coins = {25,10,5,1};
        
        for(int i = 0; i<T; i++) {
            int coin = Integer.parseInt(br.readLine());
            for(int j = 0; j<4; j++) {
                sb.append(coin/coins[j]+" ");
                coin %= coins[j];
            }
            sb.append("\n");    
        }
        System.out.println(sb);
    }    
}
