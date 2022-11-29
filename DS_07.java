// https://www.hackerrank.com/challenges/phone-book/problem

import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh) {
      	Scanner in = new Scanner(System.in);
		HashMap<String,Integer> h = new HashMap<>();
      	int n = in.nextInt();
      	in.nextLine();

      	for(int i=0; i<n; i++) {
         	String name = in.nextLine();
         	int phone = in.nextInt();
         	h.put(name, phone);
         	in.nextLine();
     	}
      	while(in.hasNext())	{
         	String s = in.nextLine();
         	if(h.get(s)!=null) { System.out.println(s+"="+h.get(s)); }
         	else { System.out.println("Not found"); }
      	}
		in.close();
	}
}