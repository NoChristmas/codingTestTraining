package Solving;

public class Carpet {
    public static void main(String[] args){
        int brown = 24;
        int yellow = 24;
        int max =0;

        int vert = 0;
        int bott = 0;
        for(int i=1; i<Math.sqrt(yellow); i++){
            if(yellow%i==0){
                max = i;
            }
        }
        
        vert = max+2;
        bott = (yellow/max)+2;

        int[] result = {0,0};
        if(vert>bott) {
            result[0] = vert;
            result[1] = bott;

        } else {
            result[0] = bott;
            result[1] = vert;
        }
        
        System.out.println(result[0]+","+result[1]);

    }
}
