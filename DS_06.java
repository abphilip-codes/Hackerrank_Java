// https://www.hackerrank.com/challenges/java-list/problem

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i=0; i<n; i++) { arr.add(in.nextInt()); }

        int q = in.nextInt();
        while (q-- > 0) {
            switch(in.next()) {
                case "Insert":
                    arr.add(in.nextInt(), in.nextInt());
                    break;
                
                case "Delete":
                    arr.remove(in.nextInt());
                    break;
                
                default:
                    System.out.println("Invalid operation.");
                    System.exit(-1);
                    break;
            }
        }
        while(!arr.isEmpty()) { System.out.print(arr.remove(0) + " "); }
        in.close();
    }
}