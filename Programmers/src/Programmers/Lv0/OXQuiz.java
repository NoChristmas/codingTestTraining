package Programmers.Lv0;

public class OXQuiz {

	public static void main(String[] args) {
		String[] quiz = {"-43 - 4 = -47", "5 + 6 = 11"};
		String[] answer = new String[quiz.length];
		
		for(int i=0; i<quiz.length; i++) {
			String[] arr = quiz[i].split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[2]);
			int result = Integer.parseInt(arr[4]);
			
			if(arr[1].equals("+")) {
				
				if(result == a+b) answer[i] = "O";
				else answer[i] = "X";
				
				
			} else if(arr[1].equals("-")) {
				if(result == a-b) answer[i] = "O";
				else answer[i] = "X";
				
			}
		
		}

		for(String s : answer) System.out.println(s);

	}

}
