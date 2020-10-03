package ru.MishaShvetsov.java2020;

public class Main {

     public static void main(String[] args) {
	 int n = 3;
	 int c1, c3, c5;
	 int total = 0;
	 for (int C1 = 0; C1 <=n; C1++){
	     int N = n;
	     c1 = C1;
	     N = N - C1;
	     for (int C3 = 0; C3 <= n/3; C3++){
	         c3 = C3;
	         N = N - 3 * C3;
	         for (int C5 = 0; C5 <= n/5; C5++){
	             c5 = C5;
	             N = N - 5 * C5;
	             if (c1 + c3 * 3 + c5 * 5 !=n)
	                 continue;
	             ++total;
	          }
	     }
	  }
		 System.out.println(total);
    }
}
