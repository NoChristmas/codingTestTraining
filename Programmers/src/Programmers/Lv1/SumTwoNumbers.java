package Programmers.Lv1;

import java.util.ArrayList;
import java.util.Collections;

public class SumTwoNumbers {

	public static void main(String[] args) {
		int[] numbers = { 5, 0, 2, 7 };

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		// 5 0 2 7//sss
		// 5 0 2 7

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				list1.add(numbers[i] + numbers[j]);
			}
		}

		Collections.sort(list1);

		int temp = -1;
		// 2,5,7,7,9,12////ss
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) != temp) {
				temp = list1.get(i);
				list2.add(list1.get(i));
			}
		}

		int[] result = new int[list2.size()];

		for (int i = 0; i < list2.size(); i++) {
			result[i] = list2.get(i);
		}

		System.out.println(result[0]);

	}

}
