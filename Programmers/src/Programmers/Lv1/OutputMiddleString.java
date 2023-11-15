package Programmers.Lv1;

public class OutputMiddleString {

	public static void main(String[] args) {
		String s = "abcd";
		int length = s.length();
		int midindex = 0;
		String result = "";
		if (length%2 == 1) {
			midindex = length/2;
			result += String.valueOf(s.charAt(midindex));
		}
		else if(length%2 == 0) {
			midindex = (length/2)-1;
			result += String.valueOf(s.charAt(midindex));
			result += String.valueOf(s.charAt(midindex+1));
		}
		 System.out.println(result);
		
	}

}
