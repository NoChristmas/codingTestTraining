package Solving;



public class DevideArray {
    public static void main(String[] args){
        String s = "banana";
        
        char prev = '1';
        int same = 0;
        int different = 0;
        int answer = 0;
        
        for (char c : s.toCharArray()) { //반복문이며 c가 s의 한문자씩 반복되며 들어감
            if (prev == '1') {      //prev이 시작점이면 if문 안에 넣음
                prev = c;           //시작 문자를 ch에 넣음
                same++;             //same을 1 증가
                answer++;           //덩어리니까 answer 1증가
            
            } else if (prev == c) { //두번 째 문자가 시작문자와 같으면
                same++;             //same을 1 증가
            
            } else {                //두번 째 문자가 시작문자와 다르면
                different++;        //dif를 1 증가
            }

            if (same == different) { //same갯수와 dif 갯수를 비교후 같으면 끝
                prev = '1';          //밑은 초기화 해줌
                same = 0; different = 0;
            }
        }

        System.out.println(answer);
    }
}

//b ok start
//a ok end ++1
//n ok start
//a ok end ++1
//a ok start 
//a next start end
//c 
//d