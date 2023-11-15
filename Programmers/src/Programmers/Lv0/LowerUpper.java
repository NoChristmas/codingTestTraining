package Programmers.Lv0;

import java.util.Scanner;

public class LowerUpper {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        String str = in.next();
        String result="";
        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length; i++){
            if(ch[i] >='a' && ch[i]<='z'){
                ch[i]-='a';
                ch[i]+='A';
            } else if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]-='A';
                ch[i]+='a';
            }
            result +=String.valueOf(ch[i]);
        }
        System.out.println(result);
    }
}
