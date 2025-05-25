package Yahav_Yehoshua_Bariah;

import java.util.Scanner;

public class GetInfoAddQuestiont {
	public void addQuestion(Scanner input, Repository r1) {
		// Input: Repository object.
		// Output: The function adds the question to the repository (array).
		boolean correct;
		String newString;
		String difficultyQueString;
		Question.eDifficulty difficultyQue;
		boolean typeQue;
		do {
			System.out.println("Enter the new question.");
			do {
				newString = input.nextLine();
			} while (newString.isEmpty());
			do {
				System.out.println("Enter the difficulty level of the question <Hard, Medium, Easy>");
				difficultyQueString = input.next(); // Receiving the difficulty level of the new question from the user.
				correct = difficultyQueString.equals("Hard") || difficultyQueString.equals("Medium")
						|| difficultyQueString.equals("Easy");
				if (!correct)
					System.out.println("The value is incorrect.");
			} while (!correct);
			difficultyQue = Question.eDifficulty.valueOf(difficultyQueString);
			System.out.println("The type of the new quetion is a close question <true/false>");
			typeQue = input.nextBoolean();
			correct = r1.addQuestion(newString, difficultyQue, typeQue);
			if (!correct)
				System.out.println("This question already exists in the repository.");
		} while (!correct);
	}
}
