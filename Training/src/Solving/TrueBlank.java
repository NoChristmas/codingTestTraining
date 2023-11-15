package Solving;

import java.util.ArrayList;

public class TrueBlank {
    public static void main(String[] args) {
        String s = "(()(";

        boolean flag = true;
        ArrayList<String> list = new ArrayList<>();

        for (String str : s.split("")) {
            list.add(str);
        }
        
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(")") && i > 0 && list.get(i - 1).equals("(")) {
                list.remove(i);
                list.remove(i - 1);

                i -= 2;
            } else {
                flag = false;
                break;
            }

        }
        if (list.size() != 0)
            flag = false;

        System.out.println(flag);
    }
}
