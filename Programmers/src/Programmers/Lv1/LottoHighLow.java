package Programmers.Lv1;

public class LottoHighLow {

	public static void main(String[] args) {
		int[] lottos = {45, 0, 0, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		int[] result = new int[2];
		int zerocnt = 0;
		int cnt = 0;
		for(int i = 0; i<6; i++) {
			if(lottos[i] == 0) zerocnt++;
			for(int j = 0 ; j<6; j++) {
				if(lottos[i] == win_nums[j]) cnt ++;
			}
		}
		int minnumber = 6;
		int maxnumber = 6;
		int min = cnt;
		int max = zerocnt + cnt;
		/*if(min == 2) minnumber = 5; >> 초기조건을 조금더 단순화 시킴
		else if(min ==3) minnumber =4;
		else if(min ==4) minnumber =3;
		else if(min ==5) minnumber =2;
		else if(min ==6) minnumber =1;
		
		if(max == 2) maxnumber = 5;
		else if(max ==3) maxnumber =4;
		else if(max ==4) maxnumber =3;
		else if(max ==5) maxnumber =2;
		else if(max ==6) maxnumber =1;*/ 
		minnumber = 7-min;
		maxnumber = 7-max;
		if(minnumber ==7) minnumber = 6;
		if(maxnumber ==7) maxnumber = 6;
		result[1] = minnumber;
		result[0] = maxnumber;
		
		System.out.println(result[0]+" "+result[1]);
	}

}
