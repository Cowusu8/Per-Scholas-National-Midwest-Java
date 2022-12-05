package Java_Strings;
import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		System.out.println("Java String Tokens - Assignment from HackerRank");

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] str = s.trim().split("[ !,?._'@]+");

		System.out.println("" + str.length + "");
		for (String listofString : str) {
			System.out.println(listofString);
			scan.close();
		}
	}

}
