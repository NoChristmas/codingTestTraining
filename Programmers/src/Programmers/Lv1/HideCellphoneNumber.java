package Programmers.Lv1;

public class HideCellphoneNumber {

	public static void main(String[] args) {
		String phone_number = "01033334444";
		String result = "";
		int length = phone_number.length();
		char[] ch = phone_number.toCharArray();
		for(int i = 0; i<length-4; i++) {
			ch[i] = '*';
			result += String.valueOf(ch[i]);
		}
		for (int i = length-4; i<length; i++ ) {
			ch[i] = phone_number.charAt(i);
			result += String.valueOf(ch[i]);
		}
		
		System.out.println(result);
	}

}
