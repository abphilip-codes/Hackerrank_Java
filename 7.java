// https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s=0;
            int f=1;
            for(int j=0;j<n;j++)
            {
                s = s+f*b;
                System.out.print(a+s+" ");
                f=f*2;
            }
            System.out.println();
        }
        in.close();
    }
}

