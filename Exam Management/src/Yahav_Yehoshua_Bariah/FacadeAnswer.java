package Yahav_Yehoshua_Bariah;

import java.util.Scanner;

public class FacadeAnswer {
	private Scanner input = new Scanner(System.in);
	private Command addAnsCommand;
	private Command addAnsToQueCommand;
	
	public FacadeAnswer(Command Anscommand, Command AnsToQuecommand) {
		this.addAnsCommand = Anscommand;
		this.addAnsToQueCommand = AnsToQuecommand;
	}
	
	public void addAnswerToRepository(Repository r1) {
		// Input: Repository object.
		// Output: The function adds the answer to the repository.
		this.addAnsCommand.execute(this.input, r1);
		MenuActionCompleteListener.notify("Add answer to repository");
	}

	public void addAnswerToQuestion(Repository r1) {
		// Input: Repository object.
		// Output: The function adds the answer.
		this.addAnsToQueCommand.execute(this.input, r1);
		MenuActionCompleteListener.notify("Add answer to question");
	}
	
	public void deleteAnswerFromQuestion(Repository r1) {
		// Input: Repository object.
		// Output: The function deletes the answer from the question.
		if (!r1.getArrQuestion().isEmpty() && !r1.getArrAnswer().isEmpty()) {
			int numQue, numAns;
			boolean correct = true;
			do {
				System.out.println(
						r1.toString() + "\nEnter the number of the question, or enter 0 to return to the main menu.");
				numQue = input.nextInt();
				if (numQue != 0) {
					System.out.println("Enter the number of the answer, or enter 0 to return to the main menu.");
					numAns = input.nextInt();
					if (numAns != 0) {
						correct = r1.deleteAnswerFromQuestion(numQue, numAns);
						if (!correct)
							System.out.println("One of the values is incorrect.");
					}
				}
			} while (!correct);
		} else
			System.out.println("There are no questions or answers in the repository");
	}
}
