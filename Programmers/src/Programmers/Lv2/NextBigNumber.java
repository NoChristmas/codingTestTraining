package Programmers.Lv2;

public class NextBigNumber {
    public static void main(String[] args) {
        int n = 78;
        // 2진수 변환 시 1의 갯수가 같아야 출력됨

        // 1의 갯수 읽기
        String binN = Integer.toBinaryString(n); // n을 이진수로 변환
        int cnt = 0;

        for (char c : binN.toCharArray()) {  //1의 갯수 확인
            if (c == '1')
            cnt++;
        }
        int findNumber = n+1;
        int findcnt =0;
        while(true){
            String binfindNumber = "";
            
            binfindNumber = Integer.toBinaryString(findNumber);
            
            for (char c : binfindNumber.toCharArray()) {  //1의 갯수 확인
                if (c == '1') findcnt++;
            }
            
            if(findcnt==cnt) break;
            findcnt = 0;
            findNumber ++;
        }

        System.out.println(findNumber);
        
    }
}
