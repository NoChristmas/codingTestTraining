package Solving;
import java.time.*;
public class YearOf2016 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 24;
		
		System.out.println(LocalDate.of(2016, a, b).getDayOfWeek());
		
		System.out.println(LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3));
		
		

	}

}
