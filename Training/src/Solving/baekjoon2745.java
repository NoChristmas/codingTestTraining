package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String,Integer> map = new HashMap<>();
        char ch = 'A';
        for(int i = 0; i<=25; i++) {
            ch = (char) ('A'+i);
            map.put(String.valueOf(ch),i+10);
        }
        
        String str = st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        
        int j = 0;
        int res = 0;
        for(int i = str.length()-1; i>=0 ;i--) {
            String temp = String.valueOf(str.charAt(i));
            boolean flag = false;
            int number = 0;
            for(String key : map.keySet()) {
                if(temp.equals(key)) {
                    number = map.get(key);
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                number = Integer.parseInt(temp);
            }
            number *= Math.pow(N,j);
            res += number;
            j++;
        }
        System.out.println(res);
    }
}
