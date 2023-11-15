package FailQuiz;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class SortArrays {
	public static void main(String[] args) {
		//굉장히 천재적인 발상
		String[] strings= {"abce","abcd","cdx"};
		int n = 2;
		String[] result = {};
		
		ArrayList<String> list = new ArrayList<>(); //ArrayList로 선언 하여 계속 배열에 밀어넣기
		for(int i = 0; i<strings.length; i++) {
			list.add(""+strings[i].charAt(n)+strings[i]);  //String 형태로 ""를 추가하고 맨 앞글자에 글자 추가 및 뒤에 strings 배열을 붙이기
		}
		Collections.sort(list);					//그대로 정렬
		result = new String[list.size()];       //String 배열 다시 선언하여 list size로 다시 생성
		for(int i=0; i<list.size();i++) {
			result[i] = list.get(i).substring(1,list.get(i).length()); //substring을 사용해 맨 앞글자를 빼고 뒤에 문자만 출력하여 Result에 밀어넣기...
		}
		System.out.println(result[0]);
	}

}
/*String[] result = new String[strings.length];   // 나의 fail 코드....
String str = "";
char[] ch = new char[strings.length];
for(int i =0; i<strings.length; i++) {
	ch[i] = strings[i].charAt(n);
}
Arrays.sort(ch);
str = String.valueOf(ch);

for(int i =0; i<strings.length; i++) {
	int idx = 0;
	for(int j =0; j<strings.length; j++) {
		if(strings[j].contains(String.valueOf(str.charAt(i)))) idx = j;
		
	}
	result[i] = strings[idx];
}

for (String a : result)System.out.println(a);
*/