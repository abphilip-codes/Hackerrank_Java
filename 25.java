// https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\Z");
        String s = scan.nextLine().trim();
        if (s.length() > 0) {
            String[] t = s.split("[!,?._'@\\s]+");
            System.out.println(t.length);
            for(String z : t) {System.out.println(z);}
        } 
        else {System.out.println(0);}
        scan.close();
    }
}