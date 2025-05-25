package Yahav_Yehoshua_Bariah;

import java.util.Scanner;

public class GetInfoAddAnswerToQuestion {
	public void addAnswerToQuestion(Scanner input, Repository r1) {
		// Input: Repository object.
		// Output: The function adds the answer.
		if (!r1.getArrQuestion().isEmpty() && !r1.getArrAnswer().isEmpty()) {
			int numQue;
			boolean correct = true;
			do {
				System.out.println(
						r1.toString() + "\nEnter the number of the question, or enter 0 to return to the main menu.");
				numQue = input.nextInt();
				if (numQue != 0 && 1 <= numQue && numQue <= r1.getArrQuestion().size())
					correct = r1.addAnswerToQuestionInRepository(input, numQue);
			} while (!correct && numQue != 0);
		} else
			System.out.println("There are no questions or answers in the repository");
	}
}
