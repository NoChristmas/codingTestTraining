package Programmers.Lv0;
import java.util.Arrays;
public class SpecificArray {
	//푸는중...
	public static void main(String[] args) {
		int[] numlist = {1,2,3,4,5,6};
		int[] temparr = new int[numlist.length];
		int n = 4;
		
		//1,2,3,4,5,6
		//1,2,3,4,5,6
		
		//3,2,1,0,1,2
		//3,2,1,0,1,2
		
		int[] arr = new int[numlist.length];
        
        for(int i = 0; i<numlist.length; i++) {
        	arr[i] = Math.abs(numlist[i]-n);
        	temparr[i] = numlist[i];
        }
        
        for(int i = 1; i<numlist.length; i++) {
        	int temp = arr[i-1];
        	int cnt = 0;
        	if(arr[i] < temp) {
        		temp = arr[i];
        		cnt = i;
        	}
        	arr[i] = temparr[cnt];
        	
        }
        
        for(int i : arr) System.out.println(i);
        }

}