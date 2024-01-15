package Solving;

import java.util.*;
import java.io.*;

public class Notion022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> plusPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPQ = new PriorityQueue<>();
        int zeros = 0;
        int ones = 0;
        
        for(int i = 0; i<N; i++) {
            int number = Integer.parseInt(br.readLine());
            if(number == 1) ones++;
            if(number == 0) zeros++;
            if(number > 1) plusPQ.offer(number);
            else minusPQ.offer(number);
        }
        
        int res = 0;
        while(plusPQ.size() >1) {
            int a = plusPQ.poll();
            int b = plusPQ.poll();
            res += a*b;
        }
        if (!plusPQ.isEmpty()) res += plusPQ.poll();

        while (minusPQ.size() >1) {
            int a = minusPQ.poll();
            int b = minusPQ.poll();
            res += a*b;
        }

        if(!minusPQ.isEmpty() && zeros == 0) {
            res += minusPQ.poll();
        }

        res += ones;

        System.out.println(res);
        
        
    }    
}
