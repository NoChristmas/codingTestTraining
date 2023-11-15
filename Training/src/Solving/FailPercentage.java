package Solving;

import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;


public class FailPercentage {
    public static void main(String[] args){
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        
        int[] answer = new int[N];
        Map<Integer,Double> map = new HashMap<>();
        //<stage , FailureRate>
        
        for(int i=1; i<=N; i++) { //스테이지 단계를 반복함
            int stage = i; //스테이지 수
            int noClearPlayer = 0; //클리어한 유저 수
            int currentStagePlayer = 0; //현재 스테이지에 머문 유저 수 (못푼 사람)
            
            for(int j=0; j < stages.length; j++) {
                int player = stages[j]; //플레이어 별 머문 유저의 스테이지
                
                //현재 스테이지 클리어 못한사람
                if(stage == player) {
                    noClearPlayer++; //분자 값
                }
                //현재 스테이지 도전자
                if(stage<=player) { 
                    currentStagePlayer++;   //분모 값 총 유저수
                }
            }
            //분자와 분모를 구한 상태에서 빠져나옴

            //스테이지에 도달한 유저가 없는 경우 실패율 = 0
            //실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수 (도전자수)
            
            double failureRate = 0; //실패율을 담기 위한 초기화 값
            if(noClearPlayer!=0 && currentStagePlayer!=0) {
                failureRate = (double)noClearPlayer / (double)currentStagePlayer;
            }
            

            map.put(stage, failureRate);
            
        }

        //Key값은 이미 stage 순서대로 들어가 있다.
        //stage 1 , 0.6
        //stage 2 , 0.4
        //stage 3 , 0.4
        //stage 4 , 0.5

        //value순 정렬하여 answer배열에 넣기
        for(int i=0; i<N; i++) {
            double max = -1; //Max값 구하는 초기값
            int maxKey = 0;  //max의 Stage값
            for(int key : map.keySet()) {   //max의 키값을 가져가기 위한 
                if(max < map.get(key)) {
                    max = map.get(key);
                    maxKey = key;
                }
            }

            answer[i] = maxKey;
            map.remove(maxKey);
        }
        
        System.out.println(Arrays.toString(answer));
        
        

    }
}
