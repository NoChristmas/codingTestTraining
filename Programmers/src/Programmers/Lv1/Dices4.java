package Programmers.Lv1;

public class Dices4 {
    public static void main(String[] args){
        int a = 6;
        int b = 4;
        int c = 2;
        int d = 5;
        int result = 0;
        if(a == b && c==d && b==c) result = a*1111; //다 같은 경우
        else if (a==b && b==c && d!=a) result = (int) Math.pow(((10*a)+(d)),2);
        else if (a==c && d==c && b!=a) result = (int) Math.pow(((10*a)+(b)),2);
        else if (a==d && d==b && c!=a) result = (int) Math.pow(((10*a)+(c)),2);
        else if (c==b && d==c && b!=a) result = (int) Math.pow(((10*b)+(a)),2);
        else if (a==b && c==d) result = (a+c)*Math.abs(a-c);
        else if (a==c && b==d) result = (a+b)*Math.abs(a-b);
        else if (a==d && b==c) result = (a+b)*Math.abs(a-b);
        else if (a==b) result = c*d;
        else if (a==c) result = b*d;
        else if (a==d) result = b*c;
        else if (b==c) result = a*d;
        else if (b==d) result = a*c;
        else if (c==d) result = a*b;
        else result = Math.min(a,Math.min(b,Math.min(c,d)));

        System.out.println(result);
    }
}
