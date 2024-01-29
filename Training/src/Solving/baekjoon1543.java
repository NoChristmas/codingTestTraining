package Solving;

import java.io.*;

public class baekjoon1543 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String target = br.readLine();
    String source = br.readLine();
    
    int cnt = 0;
    
    for(int i = 0; i<=target.length()-source.length(); i++) {
        String temp = target.substring(i,i+source.length());
        System.out.println(temp);
        if(temp.equals(source)) {
            i += source.length()-1;
            cnt++;
        }
    }
    System.out.println(cnt);
    }
}
