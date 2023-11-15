package Programmers.Lv1;
import java.util.Arrays;
public class DevideArray {

	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		int divisor =5;
		int cnt = 0;
        int j = 0;
        
        for(int i =0; i<arr.length; i++){
            if(arr[i]%divisor == 0) cnt++;
        }
        
        if (cnt == 0) {
            int[] answer = {-1};
            
        } 
            int[] answer = new int[cnt];
               for(int i =0; i<arr.length; i++){
                    if(arr[i]%divisor ==0) {
                        answer[j] = arr[i];
                       j++;
                   }
              }
        Arrays.sort(answer);
        
        for (int a : answer) System.out.println(a);
	}

}
