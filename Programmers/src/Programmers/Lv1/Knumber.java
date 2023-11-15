package Programmers.Lv1;
import java.util.Arrays;
public class Knumber {

	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,5};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] result = new int[commands.length];
		
		for(int i =0; i<commands.length; i++) {
			int first = 0;
			int last = 0;
			int idx = 0;
			first = commands[i][0]-1;
			last = commands[i][1]-1;
			idx = commands[i][2]-1;
			int[] temp = new int[last-first+1];
			
			for(int j=0; j<temp.length; j++) {
				temp[j] = array[first];
				first ++;
			}
			Arrays.sort(temp);
			result[i] = temp[idx];
			
		}
		for(int i : result) System.out.println(i);
	}

}
