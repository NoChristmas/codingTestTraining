package Solving;

public class baekjoon4673 {
    public static void main(String[] args) {

        boolean[] visited = new boolean[10001];
        for(int i = 1; i<=10000; i++) {
            int temp = i;
            String strTemp = String.valueOf(i);
            for(String str : strTemp.split("")) {
                temp += Integer.parseInt(str);
            }
            if(temp > 10000) continue;
            visited[temp] = true;
        }

        for(int i = 1; i<visited.length; i++) {
            if(!visited[i]) {
                System.out.println(i);
            }
        }
    }    
}
