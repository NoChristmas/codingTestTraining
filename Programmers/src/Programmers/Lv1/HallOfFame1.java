package Programmers.Lv1;

import java.util.ArrayList;
import java.util.Collections;
public class HallOfFame1 {
    public static void main(String args[]) {
        int[] score = {0,300,40,300,20,70,150,50,500,1000};
        int k = 4;
        
        ArrayList<Integer> list = new ArrayList<>();
        int[] result = new int[score.length];

        for(int i=0; i<score.length; i++){
            
            if(i<k){
                list.add(score[i]);
            } else if(i>=k){
                if(list.get(0)<score[i]){
                    list.add(score[i]);
                    list.remove(0);
                }
            }
            
            Collections.sort(list);
            result[i] = list.get(0);

        }
        
        for(int i : result) System.out.println(i);
        
        
        
    }
}
