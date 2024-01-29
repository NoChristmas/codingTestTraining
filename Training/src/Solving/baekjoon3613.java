package Solving;

import java.io.*;

public class baekjoon3613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.contains("_")) {
            for(String temp : str.split("")) {
                if(temp.charAt(0)>=65 && temp.charAt(0)<=90) {
                    System.out.println("Error!");
                    return;
                }
            }
        }
        String result = "";
        if(str.contains("_")) { //C++ to Java
            String[] arr = str.split("_");
            for(int i = 0; i<arr.length; i++) {
                if(i == 0) {
                    result += arr[i];
                    continue;
                }
                
                result += String.valueOf(arr[i].charAt(0)).toUpperCase();
                if(arr[i].length() == 1) {
                    continue;
                }
                result += arr[i].substring(1,arr[i].length());
            }
        } else { //Java to C++
            //65 ~ 90
            for(String temp : str.split("")) {
                
                if(temp.charAt(0)>=65 && temp.charAt(0)<=90) {
                    result += "_";
                    result += temp.toLowerCase();
                } else {
                    result += temp;
                }
            }
            
        }
        
        System.out.println(result);
    }
}
