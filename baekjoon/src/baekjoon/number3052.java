package baekjoon;
import java.util.Scanner;
public class number3052 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean[] answer = new boolean[42];
		int cnt = 0;
		
		for(int i = 0; i<10; i++) {
			int a = in.nextInt();
			answer[a%42] = true;
		}
		
		for(int i =0; i<42; i++) {
			if(answer[i] == true) cnt++;
		}
		
		System.out.println(cnt);
			
		
	}

}
