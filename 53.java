// https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try { System.out.println(sc.nextInt() / sc.nextInt()); }
        catch(InputMismatchException e1) { System.out.println(e1.getClass().getName()); }
        catch(ArithmeticException e2) { System.out.println(e2.getClass().getName()+": "+e2.getMessage()); }
        catch(Exception e3){ System.out.println(e3.getMessage()); }
        sc.close();
    }
}