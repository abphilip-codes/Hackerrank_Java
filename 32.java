// https://www.hackerrank.com/challenges/java-primality-test/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
        in.close();
    }
}