package Programmers.Lv1;

import java.util.Map;
import java.util.HashMap;


public class Marathon {
    public static void main(String[] args){
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        
        String result = "";
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0; i<participant.length; i++){    //참가자의 이름이 있으면 1, 중복이면 1씩 증가
            map.put(participant[i],map.getOrDefault(participant[i],0)+1);
        }
        
        for(int i=0; i<completion.length; i++){     //완주자의 이름이 있으면 -1
            map.put(completion[i],map.get(completion[i])-1);
        }

        //Hashmap의 완주자 이름의 Value가 0이상이면 출력

        for(String key : map.keySet()){
            if(map.get(key)>0){
                result += key;
            }
        }
        System.out.println(result);
    }
}
