package Iteration;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AssignmentLoops {

	public static void main(String[] args) {
		question1();
		question2();
		question3();

	}

	public static void question1() {
		/*
		 * Write a program that uses nested for loops to print a multiplication table.
		 */
		System.out.println("Question1");
		for (int i = 1; i <= 12; i++) {
			for (int r = 1; r <= 12; r++) {

				System.out.printf("%4d ", i * r);
			}

			System.out.println(" ");
		}
	}

	public static void question2() {
		/*
		 * Write a program that prompts the user to enter two positive integers, and
		 * find their greatest common divisor (GCD).
		 */
		System.out.println("Question2");
		Scanner input = new Scanner(System.in);
		int n1, n2, gcf;

		System.out.println("Enter two positive intergers? ");
		n1 = input.nextInt();
		n2 = input.nextInt();

		for (int k = 1; k <= n1; k++) {
			if (n1 % k == 0 && n2 % k == 0)
				;
			System.out.println(k);
		}

	}

	public static void question3() {
		/*
		 * Suppose the tuition for a university is $10,000 for the current year and
		 * increases by 7 percent every year. In how many years will the tuition be
		 * doubled?
		 */
		double tuition = 10000, tuitionIncrease = 0.07, sumOfTuition = 0;
		final byte YEAR = 14;
		final double TUITION_INCREASE = 0.07;
		String pattern;
		DecimalFormat decimalFormat = new DecimalFormat("#.00");

		System.out.println("---------------------------------" + "\n|\tYear\t|\tTuition\t|\n"
				+ "---------------------------------");

		for (int i = 1; i <= YEAR; i++) {
			String paddedYear = String.format("%02d", i);
			if (i <= 12) {
				Object decimal;
				System.out.println("|\t" + paddedYear + "\t\t|\t$" + decimalFormat.format(tuition));
			} else {
				sumOfTuition = tuition;
			}
			tuition += (tuition * TUITION_INCREASE);
		}
		System.out.println("---------------------------------" + "\n");

		System.out.println("In 12 years the tuition will be doubled");
	}

}
