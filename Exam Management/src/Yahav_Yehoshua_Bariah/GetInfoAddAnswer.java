package Yahav_Yehoshua_Bariah;

import java.util.Scanner;

public class GetInfoAddAnswer {
	public void addAnswerToRepository(Scanner input, Repository r1) {
		// Input: Repository object.
		// Output: The function adds the answer to the repository.
		boolean correct;
		String newString;
		do {
			System.out.println("Enter the new answer -");
			do {
				newString = input.nextLine();
			} while (newString.isEmpty());
			correct = r1.addAnswerToRepository(newString);
			if (!correct)
				System.out.println("This answer already exists in the repository.");
		} while (!correct);
	}
}
