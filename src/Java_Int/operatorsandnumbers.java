package Java_Int;
public class Operatorsandnumbers {

	public static void main(String[] args) {

		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
		question8();
	}

	public static void question1() {
		/*
		 * Write the following integers in binary notation. Do not use any Java
		 * functions or online conversion applications to calculate the answer, as this
		 * will hinder the learning process and your understanding of the concept.
		 * However, you may check your answers using Java methods. 1 8 33 78 787 33,987
		 * 
		 */

		System.out.println("1          01");
		System.out.println("8          1000");
		System.out.println("33         100001");
		System.out.println("78         1001110");
		System.out.println("787        1100010011");
		System.out.println("33,987     1000010011000011");
		System.out.println("                             ");

	}

	private static void question2() {
		/*
		 * Convert the following binary numbers to decimal notation. Do not use any Java
		 * functions or online conversion applications to calculate the answer, as this
		 * will hinder the learning process and your understanding of the concept.
		 * However, you may check your answers using Java methods. 0010 1001 0011 0100
		 * 0111 0010 0010 0001 1111 0010 1100 0110 0111
		 * 
		 */

		System.out.println("0010                   2");
		System.out.println("1001                   9");
		System.out.println("0011 0100              56");
		System.out.println("0111 0010              114");
		System.out.println("0010 0001 1111         129");
		System.out.println("0010 1100 0110 0111    11,367");

		System.out.println("                             ");

	}

	private static void question3() {
		/*
		 * Write a program that declares an integer a variable x and assigns the value 2
		 * to it and prints out the binary string version of the number (
		 * Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift
		 * by 1 and assign the result to x. Before printing the results, write a comment
		 * with the predicted decimal value and binary string. Now, print out x in
		 * decimal form and in binary notation. Do the preceding exercise with the
		 * following values: 9 17 88
		 * 
		 */
		System.out.println("Question 3");
		System.out.println("                             ");
		int x = 2;
		// 10
		System.out.println("The binary representation of " + x + " is: " + Integer.toBinaryString(x));
		// 4
		x = x << 1;
		System.out.println("Left shift 2 by one positions: " + x);
		System.out.println();

		int y = 9;
		// 1001
		System.out.println("The binary representation of " + y + " is: " + Integer.toBinaryString(y));
		// 18
		y = y << 1;
		System.out.println("Left shift 9 by one positions: " + y);
		System.out.println();

		int z = 88;
		// 1011000
		System.out.println("The binary representation of " + z + " is: " + Integer.toBinaryString(z));
		// 176
		z = z << 1;
		System.out.println("Left shift 88 by one positions: " + z);
		System.out.println();

	}

	private static void question4() {
		/*
		 * Write a program that declares a variable x and assigns 150 to it, and prints
		 * out the binary string version of the number. Now use the right shift operator
		 * (>>) to shift by 2 and assign the result to x. Write a comment indicating
		 * what you anticipate the decimal and binary values to be. Now print the value
		 * of x and the binary string. Do the preceding exercise with the following
		 * values: 225 1555 32456
		 * 
		 */
		System.out.println("Question 4");
		System.out.println("                             ");
		int a = 150;
		// 10010110
		System.out.println("The binary representation of " + a + " is: " + Integer.toBinaryString(a));
		// 22
		a = a >> 2;
		System.out.println("Right shift 150 by two positions: " + a);
		System.out.println();

		int b = 225;
		// 11100001
		System.out.println("The binary representation of " + b + " is: " + Integer.toBinaryString(b));
		b = b >> 2;
		// 56
		System.out.println("Right shift 225 by two positions: " + b);
		System.out.println();

		int c = 1555;
		// 11000010011
		System.out.println("The binary representation of " + c + " is: " + Integer.toBinaryString(c));
		c = c >> 2;
		// 388
		System.out.println("Right shift 1555 by two positions: " + c);
		System.out.println();

		int d = 32456;
		// 111111011001000
		System.out.println("The binary representation of " + d + " is: " + Integer.toBinaryString(d));
		d = d >> 2;
		// 8114
		System.out.println("Right shift 32456 by two positions: " + d);
		System.out.println("                             ");

	}

	private static void question5() {
		/*
		 * Write a program that declares three int variables x, y, and z. Assign 7 to x
		 * and 17 to y. Write a comment that indicates what you predict will be the
		 * result of the bitwise & operation on x and y. Now use the bitwise & operator
		 * to derive the decimal and binary values and assign the result to z. Now, with
		 * the preceding values, use the bitwise | operator to calculate the “or” value
		 * between x and y. As before, write a comment that indicates what you predict
		 * the values to be before printing them out.
		 * 
		 */
		System.out.println("Question 5");
		System.out.println("                             ");
		int x1 = 7;
		int y1 = 17;
		int z1 = x1 & y1;

		// 111
		System.out.println("The binary representation of " + x1 + " is: " + Integer.toBinaryString(x1));
		// 10001
		System.out.println("The binary representation of " + y1 + " is: " + Integer.toBinaryString(y1));
		// 1
		System.out.println("The bitwise operatpr AND(&) on 7 and 17 gives " + z1);

		int z2 = x1 | y1;

		// 23
		System.out.println("The bitwise operatpr OR(|) on 7 and 17 gives " + z2);

		System.out.println("                             ");

	}

	private static void question6() {
		/*
		 * Write a program that declares an integer variable, assigns a number, and uses
		 * a postfix increment operator to increase the value. Print the value before
		 * and after the increment operator.
		 */
		System.out.println("Question 6");
		System.out.println("                             ");
		int i = 7;
		System.out.println("Value of i before increment is : " + i);
		i++;
		// 8
		System.out.println("Postfix increment operator on number i gives us: " + i);
		System.out.println("                             ");
		;

	}

	private static void question7() {
		/*
		 * Write a program that demonstrates at least 3 ways to increment a variable by
		 * 1 and does this multiple times. Assign a value to an integer variable, print
		 * it, increment by 1, print it again, increment by 1, and then print it again.
		 */
		System.out.println("Question 7");
		System.out.println("                             ");
		int j = 10;
		System.out.println("Value of j is:" + j);
		j++;
		System.out.println("value of j after incrementing is: " + j);
		j = j + 1;
		System.out.println("value of j after incrementing is: " + j);
		++j;
		System.out.println("value of j after incrementing is: " + j);
		System.out.println("                             ");
	}

	private static void question8() {
		/*
		 * Write a program that declares 2 integer variables, x, and y, and then assigns
		 * 5 to x and 8 to y. Create another variable sum and assign the value of ++x
		 * added to y, and print the result. Notice the value of the sum (should be 14).
		 * Now change the increment operator to postfix (x++) and re-run the program.
		 * Notice what the value of the sum is. The first configuration incremented x
		 * and then calculated the sum, while the second configuration calculated the
		 * sum and then incremented x.
		 */

		System.out.println("Question 8");
		System.out.println("                             ");
		int x2 = 5;
		int y2 = 8;
		int sum = ++x2 + y2;
		System.out.println("Value of x is " + x2);
		System.out.println("Value of y is " + y2);
		System.out.println("The sum of ++x and y is: " + sum);

		sum = x2++ + y2;
		System.out.println("The sum of x++ and y is: " + sum);

	}

	/*
	 * 
	 */

}
