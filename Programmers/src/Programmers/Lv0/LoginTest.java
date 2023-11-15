package Programmers.Lv0;

public class LoginTest {

	public static void main(String[] args) {
		//Wrong Source code
		String[] id_pw = {"meosseugi11", "12345"};
		String[][] db = {{"meosseugi11", "123456"},{"meosseugi11", "123458"},{"ss", "12345"}};
		String answer = "fail";
		
		for(int i =0; i<db.length; i++) {
			
			if(id_pw[0].equals(db[i][0])) {
				if(!id_pw[1].equals(db[i][1])) {
					answer = "wrong pw";
					
				} else {
					answer = "login";
					break;
					
				}
				
			} 
		}
		System.out.println(answer);
		
		//닷시 만들기...
		
		
	}

}
