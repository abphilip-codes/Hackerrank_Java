// https://www.hackerrank.com/challenges/java-b/problem

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet[] b = new BitSet[3];
        b[1] = b1; b[2] = b2;
      
        while(m-- >0) {
            String s = in.next();
            int x = in.nextInt();
            int y = in.nextInt();
          
            switch(s) {
                case "AND":
                    b[x].and(b[y]); break;
                case "OR":
                    b[x].or(b[y]); break;
                case "XOR":
                    b[x].xor(b[y]); break;
                case "FLIP":
                    b[x].flip(y); break;
                case "SET":
                    b[x].set(y);
            }
            System.out.printf("%d %d%n", b1.cardinality(), b2.cardinality());
        }
        in.close();
    }
}