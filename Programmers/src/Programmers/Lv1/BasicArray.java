package Programmers.Lv1;

public class BasicArray {

	public static void main(String[] args) {
		String s = "12345";
		
		boolean answer=true;
        if(s.length() == 4 || s.length() ==6) {
		try { 
            Integer.parseInt(s);
			
		} catch (NumberFormatException e) {
			answer = false;
		}
        System.out.println(answer);
        }
        else {
        	answer = false;
        	System.out.println(answer);
        }
       
	}

}
