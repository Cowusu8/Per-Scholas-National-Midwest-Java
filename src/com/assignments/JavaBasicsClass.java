package com.assignments;
/*
 * Crystal Owusu
 * Assignment: Core Java - Variables 
 */

public class JavaBasicsClass {

	public static void main(String[] args) {

		// #No. 1
		int s = 5;
		int w = 7;
		int j = s + w;
		System.out.println(j);

		// #No. 2
		double c = 56;
		double z = 4;
		double t = c + z;
		System.out.println(t);

		// #No. 3
		int d = 73;
		double h = 2;
		double f = d + h;
		System.out.println(f);

		// #No. 4a
		int n1 = 23;
		int e1 = 12;
		int k1 = n1 / e1;
		System.out.println(k1);

		// No. 4b
		double n2 = 23.2;
		int e2 = 12;
		double k2 = n2 / e2;
		System.out.println(k2);
		/*
		 * When I changed the larger number to a decimal number program did not run
		 * successfully because of a type mismatch. A decimal value cannot be assigned
		 * to an int. I corrected by changing from an int to a decimal.
		 */

		// #No. 5
		double b = 47;
		double a = 16;
		double r = b / a;
		System.out.println(r);
		int ta = (int) r;
		System.out.println(ta);

		// #No. 6a
		int x = 5;
		int y = 6;
		double q = y / x;
		System.out.println(q);
		q = y;

		// #No. 6b
		/*
		 * int x = 5; int y = 6; int q = y / x; System.out.println(q); q = (double) y;
		 */

		// #No. 7
		final int POP = 7 + 7;
		System.out.println(POP);

		// #No. 8
		double coffee = 7.50;
		double espresso = 8.20;
		double machiato = 11.30;

		double subTotal = (coffee * 3 + espresso * 4 + machiato * 2);
		System.out.println(subTotal);

		final double SALES_TAX = 6.0;
		System.out.println(SALES_TAX);

		double salesTax = subTotal * (SALES_TAX / 100);

		double totalSale = subTotal + salesTax;
		System.out.printf("%.2f", totalSale);

	}

}
