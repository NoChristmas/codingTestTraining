package Programmers.Lv1;
import java.util.Arrays;
public class TerminateMinimumNumber {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		int[] result = new int[arr.length-1];
		int min = arr[0];
		int index = 0;
		
		for(int i = 0; i<arr.length; i++) {
		
			if(min > arr[i]) {
				min = arr[i];
				
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == min) continue;
			result[index++] = arr[i];
		}
		
		for(int i : result)System.out.println(i);
		
	}

}
