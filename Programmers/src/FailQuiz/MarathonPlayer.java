package FailQuiz;
import java.util.HashMap;
import java.util.Map;
public class MarathonPlayer {

	public static void main(String[] args) {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
	    String answer = "";

	    Map<String, Integer> hm = new HashMap<>();
		
	    for (String p : participant) {
	        hm.put(p, hm.getOrDefault(p, 0)+1);
	    }

	    for (String c : completion) {
	        hm.put(c, hm.get(c) - 1);
	    }

	    for (String key : hm.keySet()) {
	        if (hm.get(key) != 0) {
	            answer = key;
	            break;
	        }
	    }

	    System.out.println(answer);
	
			
			
		
				
	}

}
///////////////////////실패한 코드////////////////////////////////////
/*		Map<String,String> map = new HashMap<>(); 
		
		for(int i =0; i<completion.length; i++) map.put(completion[i],completion[i]);
		
		for(int i =0; i<participant.length; i++) {
			
			if(!map.containsKey(participant[i])) {
				result += map.getOrDefault(participant[i],participant[i]);
				map.remove(participant[i]);
			} else if (map.containsKey(participant[i])) map.remove(participant[i]);
				
		}
		
		System.out.println(result);
			
			
				//map.remove(participant[i]);
				
*/