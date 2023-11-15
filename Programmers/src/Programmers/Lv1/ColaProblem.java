package Programmers.Lv1;

public class ColaProblem {

	public static void main(String[] args) {
		
		int a = 3;   //콜라 2개를 가져다 주면
		int b = 2;   //1병을 드림   /2)*1
		int c =20;   //초기 빈병
		int vacant = c;  //초기 빈병의 갯수
		int leave = 0;   //남겨둔 빈병의 갯수
		int reward = 0;  //계속 누적될 이득

		while(true) {
			
			reward += b*((vacant)/a); // 초기에 빈병을 갔다줘서 내 배에 누적
			
			leave = vacant%a;
			
			vacant = (vacant/a)*b+leave; //빈병의 값은 받은 콜라갯수x주는갯수+나머지
			
			if(vacant <a) break;
			
		}
		System.out.println(reward);
	}

}
