package Solving;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class number1747 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean flag = true;
        int result = N+1;
        int cnt = 0;
        while(flag){
            cnt = 0;
            for(int i=1; i<=Math.sqrt(result); i++){
                if(result%i==0) cnt++;
                
            }
            result ++;
        }
    }
}
