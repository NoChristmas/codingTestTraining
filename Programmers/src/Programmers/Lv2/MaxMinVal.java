package Programmers.Lv2;

public class MaxMinVal {
    public static void main(String[] args){
        String s = "-1 -2 -3 -4";
        String result = "";

        String[] arr = s.split(" ");
        int[] arrNum = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            arrNum[i] = Integer.parseInt(arr[i]);
        }

        int max = arrNum[0];
        int min = arrNum[0];

        for(int i=1; i<arr.length; i++){
            if(max<arrNum[i]) max = arrNum[i];
            if(min>arrNum[i]) min = arrNum[i];
        }
        
        result += String.valueOf(min) + " " + String.valueOf(max);
        System.out.println(result);
    }
}
