package Programmers.Lv1;

public class harshadnumber {

	public static void main(String[] args) {
		boolean answer = true;
		
		int temp = 0;
		int x = 10;
		
		String str = String.valueOf(x);
		for(int i =0; i<str.length(); i++) {
			temp += str.charAt(i)-'0';
			
		}
		if (x%temp == 0) answer = true;
		else answer = false;
		
		System.out.println(answer);

	}

}
