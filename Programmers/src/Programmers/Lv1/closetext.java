package Programmers.Lv1;



public class closetext{
    public static void main(String args[]){
        String s = "footbar";
        
        int[] result = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            
            if(i == 0) result[i] = -1;
            int cnt = 1;    
            for(int j =i-1; j>=0;j--){
                //i 3 j 2
                
                if(s.charAt(i)==s.charAt(j)){
                    result[i] = cnt;
                    break;
                } else {
                    result[i] = -1;
                    cnt ++;
                }
            }
            
        }
        for(int i : result) System.out.println(i);
               
        

    }
}