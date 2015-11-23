package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
 System.out.println(metodaFib(9));
 System.out.println(metodafib2(5));
    }
    // itercja
    public static int metodaFib(int n){
        if (n == 0) return 0;
        int a, b, c;
        a = 1;
        b = 1;
        if (n <= 2) return a;
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    //rekurencja
    public static int metodafib2(int n){

        if (n == 1 || n == 0) {
            return n;
        } else
            return metodafib2(n - 1) + metodafib2(n - 2);
    }
}
