package Programmers.Lv2;

import java.util.Stack;

public class PairDelete {
    public static void main(String[] args) {
        String s = "cdcd";

        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            st.push(c);
            if (st.size() > 1) {
                if(st.get(st.size()-1) == st.get(st.size()-2)){
                    st.pop();
                    st.pop();
                }
            }
        }

        if(st.size()==0) System.out.println(1);
        else System.out.println(0);
    }

}
