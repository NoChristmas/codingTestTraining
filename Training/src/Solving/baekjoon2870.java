package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //97 ~ 122
        for(int i = 0; i<N; i++) {
            String str = br.readLine();
            str = str.replaceAll("[a-z]"," ");
            str = str.replaceAll("\\s+"," ");
            if(str.equals(" ")) {
                continue;
            }
            
            if(str.charAt(0) == ' ') {
                str = str.substring(1,str.length());
            }
            
            if(str.charAt(str.length()-1) == ' ') {
                str = str.substring(0,str.length()-1);
            }
            if(str.contains(" ")) {
                String[] arr = str.split(" ");
                for(String tmp : arr) {
                    pq.add(Integer.parseInt(tmp));
                }
            } else {
                pq.add(Integer.parseInt(str));
            }
        }

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }    
}
