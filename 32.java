// https://www.hackerrank.com/challenges/java-biginteger/problem

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.math.BigInteger ai = sc.nextBigInteger();
        java.math.BigInteger bi = sc.nextBigInteger();
        java.math.BigInteger sum = ai.add(bi);
        java.math.BigInteger mul = ai.multiply(bi);
        System.out.println(sum); 
        System.out.println(mul);
        sc.close();
    }
}