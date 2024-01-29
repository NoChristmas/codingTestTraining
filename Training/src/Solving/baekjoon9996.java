package Solving;

import java.io.*;

public class baekjoon9996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String pattern = br.readLine();
        pattern = pattern.replace("*"," ");
        String[] arr = pattern.split(" ");
        
        for(int i = 0; i<N; i++) {
            String str = br.readLine();
            if(str.length() < arr[0].length() + arr[1].length()) {
                System.out.println("NE");
                continue;
            }
            String heads = str.substring(0,arr[0].length());
            String tails = str.substring(str.length()-arr[1].length(),str.length());

            if(heads.equals(arr[0])&&tails.equals(arr[1])) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
            
        }
    

    }
}
