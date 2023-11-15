package Solving;

import java.util.Map;
import java.util.HashMap;


public class PhoneBook {
    public static void main(String[] args){
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean result = true;
        Map<String,Integer> map = new HashMap<>();
        

        for(int i =0; i<phone_book.length; i++) map.put(phone_book[i],i);


        for(int i =0; i<phone_book.length; i++){
            for(int j=0; j<phone_book[i].length();j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
