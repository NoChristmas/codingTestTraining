package Programmers.Lv1;

import java.util.ArrayList;

public class Reverse3Number{
    public static void main(String args[]){
        int n = 125;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int result=0;
        while(n!=0){
            list.add(n%3);
            n /=3; 
        }
        int k =0;
        for(int i = list.size()-1; i>=0; i--){
            result += (list.get(i))*(Math.pow(3,k++));
            
        }

        System.out.println(result);
    }
}