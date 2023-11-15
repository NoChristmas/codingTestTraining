package Programmers.Lv0;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCertainCharacters {
	public String solution(String my_string, String letter) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        
        list.add(my_string.replace(letter, ""));
        
        
        for (int i =0; i<list.size(); i++){
            answer += list.get(i);
        }
        
        return answer;
    }
}
