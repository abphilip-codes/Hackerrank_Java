// https://www.hackerrank.com/challenges/java-1d-array/problem

import java.util.*;

public class Solution {
    public static boolean canWin(int leap, int[] game) {
        int n = game.length;
        Stack<Integer> k = new Stack<>();
        k.push(0);

        while(!k.isEmpty()) {
            int i = k.pop();
            if(i>=n) return true;
            if(i<0 || game[i]==1) continue;
            game[i] = 1;

            k.push(i+1);
            k.push(i-1);
            k.push(i+leap);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i=0; i<n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println((canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}