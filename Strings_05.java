// https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length()) {return false;}
        a = a.toLowerCase();
        b = b.toLowerCase();
        int k = 0;
        for(char c = 'a'; c <= 'z'; c++) {
            for(int z=0; z<a.length(); z++) {
                if(a.charAt(z)==c) {k++;}
                if(b.charAt(z)==c) {k--;}
            }
            if(k!=0) {return false;}
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}