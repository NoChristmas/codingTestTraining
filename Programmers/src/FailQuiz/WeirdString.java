package FailQuiz;

public class WeirdString {
	public static void main(String[] args) {
		String s = "aaa aaaa  aa aa";
		String[] arr = s.split("");
		String result = "";
		int cnt =0;
			for(int i =0; i<arr.length; i++) {
				if(arr[i].equals(" ")) {
					cnt = 0;
				} else if (cnt%2 == 0) {
					arr[i] = arr[i].toUpperCase();
					cnt++;
				} else if (cnt%2 != 0) {
					arr[i] = arr[i].toLowerCase();
					cnt++;
				}
				
				result += arr[i];
			
			
			}
			System.out.println(result);
	}

}
/* 내 오답
String[] temp = s.split(" "); << s.split(" ",-1)로 교체 해야됨 
		String result = "";
		
		for(int j = 0; j<temp.length; j++) {
			for(int i =0; i<temp[j].length(); i++) {
				char[] ch = temp[j].toCharArray();
				if(i%2==0) {
					result += String.valueOf(ch[i]).toUpperCase();
				} else if(i%2 !=0) {
					result += String.valueOf(ch[i]).toLowerCase();
				}
				
			}
        	result += " ";
		}
        result = result.substring(0,result.length()-1);
        System.out.println(result);
*/