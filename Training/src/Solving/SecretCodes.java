package Solving;

public class SecretCodes {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String result ="";
        
        char[] arr = s.toCharArray();

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<index; j++){
                arr[i]++;
                if(arr[i]>'z') arr[i]-=26;
                
                while(skip.contains(String.valueOf(arr[i]))){
                    arr[i]++;
                    
                    if(arr[i]>'z') arr[i]-=26;
                }
            }
        }
        result = String.valueOf(arr);
        System.out.println(result);
    }

}
