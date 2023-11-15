package Programmers.Lv1;

public class StringtoInteger {

	public static void main(String[] args) {
		
		int answer = 0;
		String s = "-1234";
		switch(s.charAt(0)){
		case ('+'):
			s = s.substring(1,s.length());
			answer = Integer.parseInt(s);
			break;
		case ('-'):
			s = s.substring(1,s.length());
			answer = Integer.parseInt(s);
			answer -= answer*2;
			
			break;
			
			default : answer = Integer.parseInt(s);
				
		}
		
		System.out.println(answer);
	}

}
