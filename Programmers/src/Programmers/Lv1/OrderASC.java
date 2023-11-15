package Programmers.Lv1;
import java.util.Arrays;
import java.util.ArrayList;
public class OrderASC {

	public static void main(String[] args) {
		
		String s = "bZcdefg";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		String answer = "";
		answer = new StringBuffer(new String(ch)).reverse().toString();
		
		System.out.println(answer);
		
	}

}
