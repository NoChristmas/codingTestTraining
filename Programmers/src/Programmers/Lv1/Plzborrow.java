package Programmers.Lv1;

import java.util.Arrays;



public class Plzborrow {
    public static void main(String args[]){
        int n = 3;
        int[] lost = {3};
        int[] reserve={1};

        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int result = n-lost.length;
        
        for(int i =0; i<lost.length; i++){
            for(int j=0; j<reserve.length;j++){
                if(lost[i]==reserve[j]){
                    result ++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }


        for(int lostPerson : lost){
            for(int j=0; j<reserve.length;j++){
                if(lostPerson+1 == reserve[j] || lostPerson-1 == reserve[j]){
                    result++;
                    reserve[j] = -1;
                    break;
                }
            }
            
        }

            System.out.println(result);
    }
}
