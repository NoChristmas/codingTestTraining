package Programmers.Lv1;

import java.util.ArrayList;
import java.util.Collections;


public class FruitsBox {
    public static void main(String[] args){
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : score) list.add(i);
       
        Collections.sort(list);
        for(int i = list.size()-1; i>=0; i--){
            if(k<list.get(i)) {
                list.remove(i);
            }
        }

        Collections.reverse(list);
        
        int[][] boxes = new int[list.size()/m][m];
        
        int tmpidx =0;
        for(int i =0; i<boxes.length;i++){

            for(int j=0; j<m; j++){
                boxes[i][j] = list.get(tmpidx);
                tmpidx++;
            }
            
        }

        for(int i=0; i<boxes.length;i++){

            int min = boxes[i][0];
            for(int j=0; j<m; j++){
                if(boxes[i][j]<min) min = boxes[i][j];
            }
            result += (min*m);
        }

        System.out.println(result);

    }

}
