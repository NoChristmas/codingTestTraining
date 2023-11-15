package Solving;



public class NumPair {
    public static void main(String[] args) {
        String X = "001";
        String Y = "123450";
        String result ="";
        StringBuilder sb = new StringBuilder();

        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for(String x : X.split("")){
            xArr[Integer.parseInt(x)]++;
        }
        for(String y : Y.split("")){
            yArr[Integer.parseInt(y)]++;
        }

        for(int i=9; i>=0; i--){
            while(xArr[i]>0 && yArr[i]>0){
                sb.append(i);
                xArr[i]--;
                yArr[i]--;
            }
        }
    
        result = String.valueOf(sb);
        if(result.length()==0) result = "-1";
        if(result.charAt(0)=='0') result = "0";
        System.out.println(result);
        //결론적으로 map의 Key 값에는 

    }
}


/*import java.util.ArrayList;
import java.util.Arrays;

public class NumPair {
    public static void main(String[] args) {
        String X = "001";
        String Y = "123450";

        String str = "";
        String result = "";
        ArrayList<String> list = new ArrayList<>();
        
        //list 배열에 각각 Y의 인자값을 넣기
        for (int i = 0; i < Y.length(); i++)
            list.add(String.valueOf(Y.charAt(i)));
        
        //X의 인자값에 순서대로 찾기
        for (int i = 0; i < X.length(); i++) {

            //Y가 들어간 list 보기
            for (int j = 0; j < list.size(); j++) {
                if (String.valueOf(X.charAt(i)).equals(list.get(j))) {
                    str += list.get(j);
                    list.remove(j);
                    break;
                }
            }
        }

        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        // 순서대로 result에 넣기
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];

        }

        //예외 처리
        if (result.length() == 0)
            result = "-1";
        if (result.charAt(0) == '0')
            result = "0";


        System.out.println(result);
    }
}*/
