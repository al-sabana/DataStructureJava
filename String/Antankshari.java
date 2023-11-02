package String;

import java.util.*;

public class Antankshari {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Word Antakshari: ");
		String str = scan.nextLine();
		String out = str;

		List<String> words = new ArrayList<>();
		words.add(str);

		boolean check = true;

		do {
			System.out.println("Enter another word for Word Antakshari: ");
			str = scan.nextLine();

			if (out.charAt(out.length() - 1) == str.charAt(0)) {
				out = str;
				words.add(str);
			} else {
				System.out.println("Invalid input!");
				check = false;
			}

		} while (check);

		System.out.println("The words: " + words);
		scan.close();
	}
}
