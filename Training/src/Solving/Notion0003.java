package Solving;
import java.util.*;
import java.io.*;
public class Notion0003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        sb1.append(st.nextToken());
        sb2.append(st.nextToken());
        sb1.reverse();
        sb2.reverse();
        int result = Math.max(Integer.parseInt(String.valueOf(sb1)),Integer.parseInt(String.valueOf(sb2)));
        System.out.println(result);
    }    
}
