package Programmers.Lv0;

public class CloserNumber {

	public static void main(String[] args) {
		//n이랑 가까운 수를 뽑고 만약 차이가 같은 수가 2개면 낮은 수를 가져옵니다.
		int[] array = {20,6,22};
		int n = 21;
		int diff = Math.abs(n-array[0]);
		int result = array[0];
		int cnt = 0;
		for(int i =1; i<array.length; i++) {
				if(Math.abs(array[i]-n) < diff) {
				diff = Math.abs(array[i]-n);
				result = array[i];
				cnt = i;
			} else if(Math.abs(array[i]-n) == diff) {
				if(array[i] < array[cnt]) result = array[i];
				else result = array[cnt];
			}
		}
		System.out.println(result);
	}

}
