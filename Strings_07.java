// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

import java.util.Scanner;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = Integer.parseInt(in.nextLine());
        while(c>0) {
            String p = in.nextLine();
            try {
                Pattern.compile(p);
                System.out.println("Valid");
            } 
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            c--;
        }
    }
}