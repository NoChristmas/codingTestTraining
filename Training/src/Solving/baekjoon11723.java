package Solving;

import java.util.*;
import java.io.*;

public class baekjoon11723 {
    public static void main(String[] args) throws IOException {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] arr = new boolean[21];
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            switch(key) {
                case("add") : {
                    int value = Integer.parseInt(st.nextToken());
                    arr[value] = true;
                    break;
                }
                case("check") : {
                    int value = Integer.parseInt(st.nextToken());
                    if(arr[value]) {
                        bw.write(1);
                    } else {
                        bw.write(0);
                    }
                    break;
                }
                case("remove") : {
                    int value = Integer.parseInt(st.nextToken());
                    arr[value] = false;
                    break;
                }
                case("all") : {
                    Arrays.fill(arr,true);
                    break;
                }
                case("toggle") : {
                    int value = Integer.parseInt(st.nextToken());
                    if(arr[value]) {
                        arr[value] = false;
                    } else {
                        arr[value] = true;
                    }
                    break;
                }
                case("empty") : {
                    arr = new boolean[21];
                    break; 
                }
            }    
        }
    }
}
