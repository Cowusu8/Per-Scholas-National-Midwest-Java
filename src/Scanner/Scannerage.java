package Scanner;

import java.util.Scanner;

public class Scannerage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your age?");
		int age = scan.nextInt();

		System.out.println(age);
	}

}
