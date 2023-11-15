package baekjoon;
import java.util.Scanner;
public class number25304 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
		int T = in.nextInt();
		int result = 0;
		for(int i = 0; i<T; i++) {
			int price = in.nextInt();
			int mult = in.nextInt();
			
			result += (price*mult);
			
		}
		if(result == total) System.out.println("Yes");
		else System.out.println("No");
		
	}

}
