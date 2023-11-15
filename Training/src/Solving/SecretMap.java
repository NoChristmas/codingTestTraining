package Solving;

public class SecretMap {
    
    public static void main(String[] args){
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        String[] str1 = new String[n];
        String[] str2 = new String[n];
        String[] result = new String[n];
        for(int i =0; i<n; i++){
            str1[i] = Integer.toBinaryString(arr1[i]);
            str2[i] = Integer.toBinaryString(arr2[i]);
            
            String temp="";
            
            //11011 > 011011로 출력 해야됨
            if(str1[i].length()<n || str2[i].length()<n){
                for(int j = str1[i].length() ; j<n; j++) temp +="0";
                
                str1[i] = temp + str1[i];
                temp = "";
                
                for(int j = str2[i].length(); j<n; j++) temp +="0";
                str2[i] = temp + str2[i];
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(str1[i].charAt(j) > '0' || str2[i].charAt(j) >'0'){
                    result[i] += '#';
                } else {
                    result[i] += ' ';
                }
            }    
        
        }
        
        

        
    }
    
    
}
