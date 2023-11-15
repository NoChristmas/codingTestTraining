package Programmers.Lv0;

import java.math.BigInteger;

public class addTwoNumbers {
    public static void main(String args[]){
        String a = "582";
        String b = "734";
        
        BigInteger biga = new BigInteger(a);
        BigInteger bigb = new BigInteger(b);

        String result = String.valueOf(biga.add(bigb));
        System.out.println(result);
        
    }
}
