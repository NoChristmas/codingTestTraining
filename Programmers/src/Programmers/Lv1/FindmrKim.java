package Programmers.Lv1;

public class FindmrKim {

	public static void main(String[] args) {
		
		String[] seoul = {"Jane","Kim"};
		
		int result = 0;
        String answer = "";
        
        for (int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")) result = i;
        }        
        answer += "김서방은 ";
        answer += String.valueOf(result);
        answer += "에 있다";
	}

}
