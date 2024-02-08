package Solving;

import java.util.*;
import java.io.*;

public class baekjoon10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<String[]> list = new ArrayList<>();
        for(int i = 0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            String age = st.nextToken();
            String name = st.nextToken();
            list.add(new String[]{age,name});
        }
        list.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] arr1, String[] arr2) {

                return Integer.parseInt(arr1[0]) - Integer.parseInt(arr2[0]);
            }
        });

        for(int i = 0; i<T; i++) {
            String[] temp = list.get(i);
            System.out.println(temp[0]+" "+ temp[1]);
        }
    }
}
