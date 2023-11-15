package Programmers.Lv1;

import java.util.Stack;

public class MakingArrray {
    public static void main(String[] args){
        int[] arr = {1,4,2,5,3};
        

        Stack<Integer> st = new Stack<>();
        int idx = 0;
        
        while(idx != arr.length){
            if(st.size()==0){
                st.push(arr[idx++]);
            } else if(st.size()>0 && arr[idx] > st.get(st.size()-1)){
                st.push(arr[idx++]);
            } else if(st.size()>0 && arr[idx] <= st.get(st.size()-1)){
                st.pop();
            }
            
        }
        int[] result = new int[st.size()];

        int cnt =0;
        for(int i : st){
            result[cnt++] = i;
            System.out.print(i+" ");
        }


    }
}
