package Programmers.Lv1;

import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class SortNumber {
	public long solution(long n) {
        StringBuffer sb = new StringBuffer();
        String str = String.valueOf(n);
        char[] charr = str.toCharArray();
        Arrays.sort(charr);

        for(int i=0; i<charr.length; i++) {
            sb.append(charr[i]);

        }
        sb.reverse();
        str = sb.toString();

        n = Long.parseLong(str);
        return n;
    }
	public static void main(String[] args) throws IOException {
		SortNumber sn = new SortNumber();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		System.out.println(sn.solution(n));
	}
}
