package Solving;

import java.util.*;

public class KaKaoNewID {
    public static void main(String[] args){
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        
        //1단계
        new_id = new_id.toLowerCase();

        //2단계
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        //3단계
        new_id = new_id.replaceAll("[.]{2,}", ".");
        
        //4단계
        new_id = new_id.replaceAll("^[.]|[.]$", "");

        //5단계
        if(new_id.equals("")) new_id +="a";

        //6단계
        if(new_id.length()>=16) new_id = new_id.substring(0,15);
        new_id = new_id.replaceAll("[.]$", "");

        //7단계
        if(new_id.length()<=2) {
            while(new_id.length() != 3){
                new_id += String.valueOf(new_id.charAt(new_id.length()-1));
            }

        }
        System.out.println(new_id);
    }
}
  
/* 
 * 
 //1단계
 String step1 = new_id.toLowerCase();
 
 //2단계
 char[] step1_arr = step1.toCharArray();
 StringBuilder step2 = new StringBuilder();
 for(char ch : step1_arr){
     if((ch>='a' && ch<='z') || (ch>='0' && ch<='9') || ch == '-' || ch == '_' || ch=='.') step2.append(ch);
    }
    
    //3단계
    String step3 = step2.toString();
    while(step3.contains("..")){
        step3 = step3.replace("..",".");
    }
    
    //4단계
    String step4 = step3;
    if(step4.length()>0){
    if(step4.charAt(0)=='.') step4 = step4.substring(1,step4.length());
}
if(step4.length()>0){
    if(step4.charAt(step4.length()-1)=='.') step4 = step4.substring(0,step4.length()-1);
}

//5단계
String step5 = step4;
if(step5.equals("")) step5 = "a";


//6단계
String step6 = step5;

if(step5.length()>=16){
    step6 = step5.substring(0,15);
    if(step6.charAt(step6.length()-1)=='.') step6 = step6.substring(0,step6.length()-1);
}

//7단계
String step7 = step6;
if(step7.length()<=2){
    
    while(step7.length()!=3){
        step7 += String.valueOf(step6.charAt(step6.length()-1));
        
    }
    
}

System.out.println(step7);
*/
