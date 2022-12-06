// https://www.hackerrank.com/challenges/java-md5/problem

import java.util.*;
import java.security.*;

public class Solution {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner in = new Scanner(System.in);
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(in.nextLine().getBytes());
        for(byte z : m.digest()) 
            System.out.print(String.format("%02x", z));
        System.out.println();
        in.close();
    }
}