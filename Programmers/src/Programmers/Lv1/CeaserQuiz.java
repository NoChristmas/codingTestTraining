package Programmers.Lv1;

public class CeaserQuiz {

	public static void main(String[] args) {
		String s = "a B z";
		int n = 25;
		String result = "";
		char[] ch = s.toCharArray();
		
		
		for(int i =0; i<ch.length; i++) {
			if (ch[i] >= 65 && ch[i]<=90) {
				ch[i] +=n;
				if(ch[i] >90) ch[i] -= 26;
			} else if(ch[i] >=97 && ch[i]<=122) {
				ch[i] +=n;
				if(ch[i] >122) ch[i] -=26;
				
			}
			result += String.valueOf(ch[i]);
			
		}
		System.out.println(result);
		
		
		//a = 97, z = 122
		//A = 65 , Z = 90
	}

}
