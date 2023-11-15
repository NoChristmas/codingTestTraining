package Solving;

public class kakaoBlindDart {
    public static void main(String args[]) {
        String dartResult = "1T2D3D#";

        int answer = 0;
        int[] dart = { 0, 0, 0 };
        int n = 0;
        int idx = 0;

        String numstr = "";

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i); // char로 dartResult의 값들을 순서대로 읽어감

            if (c >= '0' && c <= '9') { // 한자리 숫자일 때 걸림
                numstr += String.valueOf(c);

            } else if (c == 'S' || c == 'D' || c == 'T') { // 보너스 이전은 무조건 숫자이기 때문에 두자리 숫자도 걸림
                n = Integer.parseInt(numstr);
                if (c == 'S') {
                    dart[idx++] = (int) Math.pow(n, 1);
                } else if (c == 'D') {
                    dart[idx++] = (int) Math.pow(n, 2);
                } else {
                    dart[idx++] = (int) Math.pow(n, 3);
                }

                numstr = ""; //S,D,T중 하나를 받고 연산이 끝나면 numstr를 초기화 하여 다시 받을 준비를 한다.

            } else {    // 옵션일 때 걸린다.
                if (c == '*') {
                    dart[idx - 1] *= 2;  //첫번째로 *이 나오면 2배를 해준다.
                    
                    if (idx - 2 >= 0) //두번째 *이 나오면 첫번째 인자와 두번째 인자를 2배로 각각 곱해준다.
                        dart[idx - 2] *= 2;

                } else {
                    dart[idx - 1] *= (-1);
                }
            }
        }

        answer = dart[0] + dart[1] + dart[2];

        System.out.println(answer);

    }
}
