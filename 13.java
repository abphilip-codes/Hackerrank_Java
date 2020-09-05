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
        /*
        int l1 = d.length();
        if(d.indexOf(".")==-1){
            index = l1-1;
        }
        else {
            index = d.indexOf(".");
        }
        */
        NumberFormat formatter1 = NumberFormat.getCurrencyInstance(Locale.US);  
        String us = formatter1.format(r);  
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.CHINA);  
        String china = formatter2.format(r);  
        NumberFormat formatter3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);  
        String france = formatter3.format(r);  
        NumberFormat formatter4 = NumberFormat.getCurrencyInstance(Locale.US);  
        String india2 = formatter4.format(r); 
        /*
        int a = (int)r;
        String s = Integer.toString(a);
        int l = s.length();
        String india = "";
        int b=0;
        if(l<=3)
        {
            india = "Rs."+d;
        }
        else 
        {
            int i;
            for(i=0;i<l;i++)
            {
                india = Integer.toString(a%10)+india;
                a=a/10;
                b++;
                if(b==3)
                {
                    b=0;
                    india = ","+india;
                }
            }
            india = "Rs."+india+d.substring(index);
        }
        */
        index = india2.indexOf("$");
        String india = "Rs."+india2.substring(index+1);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

