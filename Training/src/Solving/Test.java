package Solving;

import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double parent = 0.0;
        double child = 0.0;
        
        for(int i = 0; i<20; i++) {
            //학점
            //학점 점수 * 
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            Double num = Double.parseDouble(st.nextToken());
            String str = st.nextToken();
            
            switch(str) {
                case "A+" : {
                    child += (4.5*num);
                    parent += num;
                    break;
                }
                case "A0" : {
                    child += (num*4.0);
                    parent += num;
                    break;
                }
                case "B+" : {
                    child += 3.5*num;
                    parent += num;
                    break;
                }
                case "B0" : {
                    child += 3.0*num;
                    parent += num;
                    break;
                }
                case "C+" : {
                    child += 2.5*num;
                    parent += num;
                    break;
                }
                case "C0" : {
                    child += 2.0*num;
                    parent += num;
                    break;
                }
                case "D+" : {
                    child += 1.5*num;
                    parent += num;
                    break;
                }
                case "D0" : {
                    child += 1.0*num;
                    parent += num;
                    break;
                }
                case "F" : {
                    parent += num;
                    break;
                }
                case "P" : {
                    break;
                    
                }
            }
        }
        if(parent == 0.0) {
            System.out.println(0.000000);
            return;
        }
        System.out.println("전공 과목별 : "+ child);
        System.out.println("학점 종합 : " + parent);
        System.out.println((double)(child/parent));
    }
}