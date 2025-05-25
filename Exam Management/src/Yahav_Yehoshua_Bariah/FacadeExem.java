package Yahav_Yehoshua_Bariah;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FacadeExem {
	private Scanner input = new Scanner(System.in);

	public void createExam(Repository r1) throws FileNotFoundException {
		System.out.println("1) Manual exam\n" + "2) Automatic exam\n" + "0) Exit.\n"
				+ "Enter the number of the function you want to perform.");
		int num = input.nextInt();
		FileExemable fileExem = null;
		Examable ex = null;
		if (0 <= num && num <= 2) {
			if (num != 0) {
				if (num == 1) {
					fileExem = new FileManualExam();
					ex = ManualExamFactory.create();
				}
				if (num == 2) {
					fileExem = new FileAutomaticExam();
					ex = AutomaticExamFactory.create();
				}
				ex.createExam(r1);
				fileExem.createFileE(ex.getQuestionArr());
				fileExem.createFileS(ex.getQuestionArr());
			}
		} else
			System.out.println("Invalid option");
	}
}
