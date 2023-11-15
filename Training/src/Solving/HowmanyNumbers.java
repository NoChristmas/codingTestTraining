package Solving;

public class HowmanyNumbers {
    public static void main(String[] args){
        int n=15;
        int result = 0;
        for (int i=1; i<=n; i+=2){ //홀수만 입력 됨...
            if(n%i==0){
                result ++;
            }
        }
        System.out.println(result);
    }
}
