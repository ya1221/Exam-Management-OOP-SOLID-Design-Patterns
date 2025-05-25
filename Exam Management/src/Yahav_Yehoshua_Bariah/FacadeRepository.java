package Yahav_Yehoshua_Bariah;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FacadeRepository {
	private Scanner input = new Scanner(System.in);
	
	public void RepositoryFunction(SystemRepository s1) throws FileNotFoundException {
		if (!s1.getArrRepository().isEmpty()) {
			int numFun;
			Repository r1 = null;
			do {
				System.out.println(
						"Enter the profession's number from the list , or enter 0 to return to the main menu -");
				numFun = input.nextInt();
				if (numFun != 0) {
					r1 = s1.getRepository(numFun);
				}
			} while (numFun != 0 && r1 == null);

			if (numFun != 0) {
				FacadeQustion facQue = new FacadeQustion(new CommandAddQuestion(new GetInfoAddQuestiont()));
				FacadeAnswer facAns = new FacadeAnswer(new CommandAddAnswer(new GetInfoAddAnswer()), new CommandAddAnswerToQuestion(new GetInfoAddAnswerToQuestion()));
				FacadeExem facexem = new FacadeExem();
				do {
					System.out.println(
							"1 - Displaying all the questions in the repository and the answers entered to the questions.\n"
									+ "2 - Adding a new answer to the repository.\n"
									+ "3 - Adding an answer from the repository to an existing question.\n"
									+ "4 - Adding a new question to the repository.\n"
									+ "5 - Deleting an answer to a question from the repository.\n"
									+ "6 - Deleting a question from the repository.\n" + "7 - Creating a exam.\n"
									+ "0 - Exit.\n" + "Enter the number of the function you want to perform.");
					numFun = input.nextInt();
					switch (numFun) {
					case 1:
						System.out.println(r1.toString());
						break;
					case 2:
						facAns.addAnswerToRepository(r1);
						break;
					case 3:
						facAns.addAnswerToQuestion(r1);
						break;
					case 4:
						facQue.addQuestion(r1);
						break;
					case 5:
						facAns.deleteAnswerFromQuestion(r1);
						break;
					case 6:
						facQue.deleteQuestion(r1);
						break;
					case 7:
						facexem.createExam(r1);
						break;
					case 0:
						break;
					default:
						System.out.println("Invalid option");
						break;
					}
				} while (numFun != 0);
			}
		} else
			System.out.println("There are no professions in the system, please enter a new profession.");
	}

	public void addRepository(SystemRepository s1) {
		String newString;
		do {
			System.out.println("Enter the new profession -");
			do {
				newString = input.nextLine();
			} while (newString.isEmpty());
		} while (!s1.addRepositoryToSystemRepository(newString));
	}
}
