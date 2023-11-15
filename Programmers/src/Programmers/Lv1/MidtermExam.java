package Programmers.Lv1;

import java.util.ArrayList;

public class MidtermExam {

	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5 };

		int[] Student1 = { 1, 2, 3, 4, 5 };
		int[] Student2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] Student3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int[] Scores = { 0, 0, 0 };
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == Student1[i % 5])
				Scores[0]++;
			if (answers[i] == Student2[i % 8])
				Scores[1]++;
			if (answers[i] == Student3[i % 10])
				Scores[2]++;
		}

		int max = Math.max(Scores[0], Math.max(Scores[1],Scores[2]));
		
		for(int i=0; i<Scores.length;i++) {
			if(max==Scores[i]){
				list.add(i+1);
			}
		}
		int[] result = new int[list.size()];
		for(int i=0; i<list.size();i++) {
			result[i] = list.get(i);
		}

		System.out.println(result);
	}

}

/*
 * int[] Scores = {0,0,0};
 * 
 * for(int i = 0; i<answer.length;i++) {
 * if(answer[i]==Student1[i%5]) Scores[0]++;
 * if(answer[i]==Student2[i%8]) Scores[1]++;
 * if(answer[i]==Student3[i%10]) Scores[2]++;
 * 
 * }
 * 
 * int max= Math.max(Scores[0],Math.max(Scores[1], Scores[2]));
 * 
 * for(int i =0; i<Scores.length; i++) if(max==Scores[i]) list.add(i+1);
 * 
 * int[] result = new int[list.size()];
 * 
 * for(int i =0; i<list.size();i++) {
 * result[i] = list.get(i);
 * }
 * 
 * for(int i:result) System.out.println(i);
 * 
 * //Score1이 가장 큰 경우
 * 
 */