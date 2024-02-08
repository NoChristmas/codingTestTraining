package Solving;

import java.io.*;

public class baekjoon1747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        boolean[] prime = new boolean[1_004_001+1];
        prime[0] = prime[1] = true;
        for(int i = 2; i<= Math.sqrt(1_004_001); i++) {
            if(!prime[i]) {
                for(int j = i*i; j<prime.length; j +=i) {
                    prime[j] = true;
                }
            }
        }
        
        for(int i = num; i<=1_004_001; i++) {
            if(!prime[i]) { // 소수임
                StringBuilder sb = new StringBuilder();
                String str = String.valueOf(i);
                sb.append(str).reverse();
                if(str.equals(sb.toString())) {
                    System.out.println(i);
                    return;
                }                
            }
        }
    } 
}
