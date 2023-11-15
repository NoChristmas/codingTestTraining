package Programmers.Lv0;

import java.util.ArrayList;

public class emptyarradddel{
    public static void main(String args[]){
        int[] arr = {3,2,4,1,3};
        boolean[] flag = {true,false,true,false,false};

        ArrayList<Integer> list = new ArrayList<>();
        

        for(int i=0; i<arr.length; i++){

            if(flag[i]){
                for(int j =0; j<arr[i]*2; j++){
                    list.add(arr[i]);
                }
            }else{
                
                for(int j =0; j<arr[i]; j++){
                    list.remove(list.size()-1);
                }
            }

            
        }
        
        int[] result = new int[list.size()];
        for(int i=0; i<list.size();i++){
            result[i] = list.get(i);
        }
        
        for(int i:result) System.out.print(i+" ");
    }
}