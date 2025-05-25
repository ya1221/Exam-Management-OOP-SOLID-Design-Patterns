package Yahav_Yehoshua_Bariah;

import java.util.Scanner;

public class CommandAddQuestion implements Command{
	private GetInfoAddQuestiont info;
	
	public CommandAddQuestion(GetInfoAddQuestiont inf) {
		this.info = inf;
	}

	@Override
	public void execute(Scanner input, Repository repository) {
		this.info.addQuestion(input, repository);
	}
}
