package Programmers.Lv2;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class MakingMin {
    public static void main(String[] args){
        int[] A = {1,4,2};
        int[] B = {5,4,4};

        int result = 0;
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for(int a : A){
            listA.add(a);
        }
        for(int b : B ){
            listB.add(b);
        }

        Collections.sort(listA);
        Collections.sort(listB);
        Collections.reverse(listB);

        int length = Math.min(A.length,B.length);

        for(int i=0; i<length; i++){
            result += (listA.get(i)*listB.get(i));
        }
        
        System.out.println(result);
        
    }
}
