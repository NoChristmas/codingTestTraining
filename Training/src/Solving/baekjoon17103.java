package Solving;

import java.util.*;
import java.io.*;

public class baekjoon17103 {
    public static void main(String[] args) {
        boolean[] prime = new boolean[1_000_000];
        //prime = false 가 소수
        for(int i = 2; i<(1_000); i++) {
            for(int j = 2; j<i; j++) {
                if(i%j == 0) {
                    prime[i] = true;
                    break;
                }
            }
        }
        for(int i =2; i<100; i++) {
            if(!prime[i]) {
                System.out.println(i);
            }
        }
    }
}
