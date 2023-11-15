package Programmers.Lv1;

public class Knights {
    public static void main(String[] args) {
        int number = 10;
        int limit = 3;
        int power = 2;
        int result = 0;
        
        //약수를 미리 int 배열에 넣기
        
        
        for(int i=1; i<=number; i++){
            if(devNum(i)>limit) {
                result +=power;
                continue;
            }
            result += devNum(i);
        }
        
        System.out.println(result);
        

        
        
    }
    //******** 매우 중요...
    static int devNum(int num){
        int cnt = 0;
        for(int j=1; j*j<=num; j++) {
            if(j*j==num) cnt++;
            else if(num%j==0) cnt +=2;
        }
        return cnt;
    }
}

/*
 * int cnt = 0;
 * for(int i=0; i<number; i++){
 * cnt = 0;
 * for(int j = 1; j<=i+1; j++){
 * if((i+1)%j == 0) cnt++;
 * }
 * if(cnt>limit) cnt = power;
 * result+=cnt;
 * }
 * 
 * System.out.println(result);
 */