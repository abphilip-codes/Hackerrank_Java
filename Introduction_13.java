// https://www.hackerrank.com/challenges/java-currency-formatter/problem

import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.text.NumberFormat;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        double r = Math.round(payment*100)/100.00;
        String d = Double.toString(r);
        int index;

        NumberFormat formatter1 = NumberFormat.getCurrencyInstance(Locale.US);  
        String us = formatter1.format(r);  
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.CHINA);  
        String china = formatter2.format(r);  
        NumberFormat formatter3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);  
        String france = formatter3.format(r);  
        NumberFormat formatter4 = NumberFormat.getCurrencyInstance(Locale.US);  
        String india2 = formatter4.format(r); 
    
        index = india2.indexOf("$");
        String india = "Rs."+india2.substring(index+1);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}