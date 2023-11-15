package Programmers.Lv1;

public class BelowArray {

    public static void main(String[] args) {
        String t = "17203";
        String p = "15";

        String[] scores = new String[t.length() - p.length() + 1];

        int j = 0;
        int result = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = t.substring(j, j + p.length());
            j++;
            if (scores[i].equals(p)) {
                result++;
                continue;
            }

            for (int k = 0; k < scores[i].length(); k++) {
                if (scores[i].charAt(k) > p.charAt(k)) {
                    // 1,7 7,2 2,0 0,3 1,5
                    break;

                }
                if (scores[i].charAt(k) < p.charAt(k)) {
                    result++;
                    break;

                }

            }

        }

        System.out.println(result);

    }
}

/*
 * int[] scores = new int[t.length()-p.length()+1];
 * 
 * int j =0;
 * int result = 0;
 * for(int i=0; i<scores.length; i++){
 * 
 * scores[i]= Integer.parseInt(t.substring(j,j+p.length()));
 * j++;
 * 
 * if(Integer.parseInt(p)>=scores[i]){
 * result ++;
 * }
 * 
 * }
 * 
 * System.out.println(result);
 */