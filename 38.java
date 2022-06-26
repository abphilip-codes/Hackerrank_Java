// https://www.hackerrank.com/challenges/java-hashset/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> h = new HashSet<String>(t);
        for(int i = 0; i < t; i++) {
            h.add("(" + pair_left[i] + ", " + pair_right[i] + ")");
            System.out.println(h.size());        
        }
    }
}