package Solving;

import java.util.*;
import java.io.*;

public class baekjoon6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] prime = new boolean[1000000+1];
        prime[0] = prime[1] = true;
        for(int i = 2; i<=Math.sqrt(1000000); i++) {
            if(!prime[i]) {
                for(int j = i*i; j<prime.length; j +=i) {
                    prime[j] = true;
                }
            }
        }

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) break;
            int head = 3;
            int tail = num-3;
            while(true) {
                //틀린 조겐
                if(head > num/2) {
                    System.out.println("Goldbach's conjecture is wrong.");
                    break;
                }

                if(head % 2 == 0 || tail % 2 == 0) {
                    head++;
                    tail--;
                    continue;
                }
                //맞는 조겐
                if(!prime[head] && !prime[tail]) {
                    System.out.println(num+" = "+ head+ " + "+tail);
                    break;
                }
                head++;
                tail--;
            }
        } 
        
    }    
}
