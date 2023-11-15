package Programmers.Lv0;

public class GiveTheRank {

	public static void main(String[] args) {
		int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
		
		int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        
        for(int i =0; i<score.length; i++){
            avg[i] = (score[i][0]+score[i][1])/2.0;
            
        }
        
        
        
        //i 75 75 40 95 95 100 20
        //j 75 75 40 95 95 100 20
        //  4  4  6  2  2  1   7
        for(int i =0; i<answer.length; i++) {
        	int cnt = 1;
        	for(int j =0; j<answer.length; j++) {
        		if(avg[j] > avg[i]) cnt ++;
        	}
        	answer[i] = cnt;
        }
        
        
        for(int k : answer) System.out.println(k);
       
	}

}
