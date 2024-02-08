package Solving;
import java.util.*;
import java.io.*;
public class baekjoon25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int sum = 0;
        for(int i = 0; i<N; i++) {
            String name = br.readLine();
            if(name.equals("ENTER")) {
                sum += set.size();
                set = new HashSet<>();
                continue;
            }
            set.add(name);
        }
        sum += set.size();
        System.out.println(sum);
    }
}
