package Solving;

public class findnumberofdouble {
    public static void main(String args[]) {
        int n = 10;
        
        boolean result = true;
        int answer = 0;
        
        for(int i =2; i<=n; i++){
            result = true;
        
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    result=false;
                    break;
                }
            }
            if(result==true) answer++;
        }
        System.out.println(answer);
    }
}
