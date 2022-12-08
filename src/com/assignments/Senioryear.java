package com.assignments;

import java.util.Scanner;

public class Senioryear {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What's your age?");
		int age = scan.nextInt();

		System.out.println(age);

		System.out.println("What is your senior year?");

		String Senioryear = scan.next();

		System.out.println("Hi thanks for asking my age is " + age + ".");

	}

}
