package Solving;

public class KaKaoKeyPads {
    public static void main(String[] args){
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String result = "";
        
        
        //대각선은 거리를 2로 봄
        
        int left = 10;
        int right = 12;

        for(int i=0; i<numbers.length; i++){
            //최초 0 누를 때 한번 봐야함

            if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){ //왼쪽 자판은 무조건 L
                result += "L";
                left = numbers[i];
            
            } else if (numbers[i]==3 || numbers[i]==6 || numbers[i]==9){ //오른쪽 자판은 무조건 R
                result += "R";
                right = numbers[i];

            } else if (numbers[i]==2 || numbers[i]==5 || numbers[i]==8 || numbers[i]==0){ //가운데 번호의 경우 조건 탐색
                int leftDist = getDistance(left, numbers[i]);
                int rightDist =getDistance(right,numbers[i]);
                
                if(leftDist == rightDist){
                    if(hand.equals("right")){
                        result +="R";
                        right = numbers[i];
                    } else {
                        result +="L";
                        left = numbers[i];
                    }

                } else if(leftDist>rightDist){
                    result += "R";
                    right = numbers[i];
                } else {
                    result += "L";
                    left = numbers[i];
                }
                
                //거리를 재고 확인
                //1  2  3
                //4  5  6
                //7  8  9
                //*  0  #

                
                //거리가 같은 경우엔 왼손잡이 오른속 잡이 확인하여 결과

            }
        }

        System.out.println(result);
    }

    static int getDistance(int cur, int target){ 
        //cur = left or right의 마지막 숫자
        //target = numbers[i]의 숫자
            
        //x축 0  1  2
            //1  2  3       y축 0
            //4  5  6       y축 1
            //7  8  9       y축 2
            //10 11 12      y축 3

        cur = (cur==0) ? 11 : cur;
        target = (target==0) ? 11 : target;
        
        int curX = (cur - 1) % 3;  //123의 경우 x축을 0으로봄, 456 x축 1, 789 x축 2 ..
        int curY = (cur - 1) / 3;  //147의 경우 y축을 0으로봄
        int targetX = (target - 1) % 3;
        int targetY = (target - 1) / 3;
        return Math.abs(curX - targetX) + Math.abs(curY - targetY);
    }
}
