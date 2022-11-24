// https://www.hackerrank.com/challenges/java-bigdecimal/problem

import java.math.BigDecimal;
import java.util.*;
class Solution {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []s = new String[n+2];
        for(int i=0; i<n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        s[n] = "Nope";
        s[n+1] = "Nope";
        Arrays.sort(s,((String number1, String number2) ->  {
            if(!(number1.equals("Nope")) && !(number2.equals("Nope"))) {
                BigDecimal value1 = new BigDecimal(number1);
                BigDecimal value2 = new BigDecimal(number2);
                return value2.compareTo(value1);
            }
            return 0;
        }));
        for(int i=0; i<n; i++) { System.out.println(s[i]); }
    }
}