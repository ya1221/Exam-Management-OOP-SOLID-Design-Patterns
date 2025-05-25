package Yahav_Yehoshua_Bariah;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileAutomaticExam extends FileExemable{
	public void createFileE(ArrayList<Question> arr) throws FileNotFoundException {
		// Input: Arraylist of Question for the test.
		// Output: The function writes to a file the content of all the questions, and
		// their answers and for close questions the answers - None of the above, There
		// is more than one correct answer.
		File fileE = new File("exam_" + DateFormat.dateFormat());
		PrintWriter pwE = new PrintWriter(fileE);
		CloseQuestions temp;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) instanceof CloseQuestions) {
				temp = (CloseQuestions) arr.get(i);
				pwE.println(temp.listAnswersForExem() + "\t" + (temp.getArrAns().size() + 1) + ") None of the above\n");
			} else
				pwE.println(arr.get(i).listAnswersForExem());
		}
		pwE.close();
	}

	public void createFileS(ArrayList<Question> arr) throws FileNotFoundException {
		// Input: Arraylist of Question for the test.
		// Output: The function writes to the file the content of the questions and
		// their correct answer.
		File fileS = new File("solution_" + DateFormat.dateFormat());
		PrintWriter pwS = new PrintWriter(fileS);
		CloseQuestions temp;
		for (int i = 0; i < arr.size(); i++) {
			pwS.println(arr.get(i).getContent());
			if (arr.get(i) instanceof CloseQuestions) {
				temp = (CloseQuestions) arr.get(i);
				if (temp.getCountCorrectAnswer() > 0)
					pwS.println(temp.showCorrectAnswer());
				else
					pwS.println("\tNone of the above\n");
			} else
				pwS.println("\tAnswer for open\n");
		}
		pwS.close();
	}
}