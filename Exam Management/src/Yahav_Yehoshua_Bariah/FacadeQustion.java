package Yahav_Yehoshua_Bariah;

import java.util.Scanner;


public class FacadeQustion {
	private Scanner input = new Scanner(System.in);
	private Command addQueCommand;
	
	public FacadeQustion(Command command) {
		this.addQueCommand = command;
	}
	
	public void addQuestion(Repository r1) {
		// Input: Repository object.
		// Output: The function adds the question to the repository (array).
		this.addQueCommand.execute(this.input, r1);
		MenuActionCompleteListener.notify("Add question to repository");
	}

	public void deleteQuestion(Repository r1) {
		// Input: Repository object.
		// Output: The function deletes the question from the Repository.
		if (!r1.getArrQuestion().isEmpty()) {
			boolean correct = true;
			int numQue;
			do {
				System.out.println(
						r1.toString() + "\nEnter the number of the question, or enter 0 to return to the main menu.");
				numQue = input.nextInt();
				if (numQue != 0) {
					correct = r1.deleteQuestion(numQue);
					if (!correct)
						System.out.println("The value is incorrect.");
				}
			} while (!correct);
		} else
			System.out.println("There are no questions in the repository.");
	}
}
