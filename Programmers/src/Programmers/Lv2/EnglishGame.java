package Programmers.Lv2;

import java.util.ArrayList;

public class EnglishGame {
    public static void main(String[] args){
        int n =2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};


        int[] result = {0,1};   //0번째 idx 는 몇번째 사람, 1번째 인덱스는 몇번째 턴
        ArrayList<String> list = new ArrayList<>();
        char keyword = '0';
        boolean flag = true;
        for(String str : words){
            result[0]++;
            if(list.size()<1) {
                list.add(str);
                keyword = str.charAt(str.length()-1);
                continue;    
            }
            if(result[0]>n){
                result[0]=1;
                result[1]++;
            }
            
            if(keyword == str.charAt(0) && !list.contains(str)){
                keyword = str.charAt(str.length()-1);
                list.add(str);
                
            } else {
                flag = false;
                break;
            }
        }
        
        if(flag) {
            result[0] = 0;
            result[1] = 0;
        }
       System.out.println(result[0]+","+result[1]);
    }
}
