// https://www.hackerrank.com/challenges/java-singleton/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton {
    private volatile static Singleton in;
    public static String str;
    private Singleton() {}
    static Singleton getSingleInstance() {
        if(in==null) {
            synchronized(Singleton.class) {
                if(in==null) { in = new Singleton(); }
            }
        }
        return in;
    }
}