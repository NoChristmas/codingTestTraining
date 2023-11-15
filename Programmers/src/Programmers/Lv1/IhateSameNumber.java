package Programmers.Lv1;

import java.util.ArrayList;
public class IhateSameNumber {
    public static void main(String args[]){
        int[] arr = {1,1,3,3,0,1,1};

        ArrayList<Integer> list = new ArrayList<>();
        int temp =-1;
        for(int i=0; i<arr.length;i++){
            if(temp==-1){
                temp=arr[i];
                list.add(arr[i]);
            } else {
                 if(temp!=arr[i]) {
                 temp=arr[i];
                 list.add(arr[i]);
                }
                
            }
        }
        
        for(int a : list) System.out.print(a+" ");

        
    }
}
