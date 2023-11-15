package Programmers.Lv1;




public class FoodFighter {

	public static void main(String[] args) {
		int[] food = {1,3,4,6};
		StringBuffer sb = new StringBuffer();
		String str = "";
		
		int[] confirmfood = new int[food.length];
		
		for(int i =0; i<food.length;i++) {
			confirmfood[i] = food[i]/2;
		}
		
		for(int i =0; i<confirmfood.length;i++) {
			if(confirmfood[i]!=0) {
				sb.append(i);
				confirmfood[i] --;
				i--;
			}
		}
		
		str += sb;
		str += "0";
		str += sb.reverse();
		
		System.out.println(str);

	}

}
