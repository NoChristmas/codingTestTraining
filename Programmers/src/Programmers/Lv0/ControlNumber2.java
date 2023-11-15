package Programmers.Lv0;

public class ControlNumber2 {
    public static void main(String args[]){
        int[] log = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String result = "";

        for(int i=1; i<log.length;i++){
            int sum = log[i]-log[i-1];
            switch(sum){
                case(1):
                result+="w";
                break;

                case(-1):
                result+="s";
                break;

                case(10):
                result+="d";
                break;

                case(-10):
                result+="a";
                break;
            }
           
        }

        System.out.println(result);
    }
    
}
