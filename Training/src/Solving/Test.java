package Solving;

import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        
        for(int i = 2; i<=10; i++) {
            for(int j = i+i; j<=10; j = j+i) {
                System.out.println("i : "+i+", j : "+ j);
            }
        }
    }
}