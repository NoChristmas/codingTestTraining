package FailQuiz;
import java.util.ArrayList;

public class IhateSameNumber {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};  //result = {1,3,0,1};
		 int[] answer = {};
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        int num = -1; //원소가 0~9까지 이므로 영향 안받는 아무 숫자.
	        for(int i=0; i<arr.length; i++){
	             if(arr[i] != num){
	                 list.add(arr[i]);
	                 num = arr[i];
	             }
	        }
	        
	        answer = new int[list.size()]; //answer 리스트 크기 선언.
	        for(int i=0; i<answer.length; i++){
	            answer[i] = list.get(i);
	            
	        }
	        for(int i : answer) {
	        	System.out.print(i+" ");
	        }
	    }
	}