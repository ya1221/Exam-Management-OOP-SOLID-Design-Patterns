package Yahav_Yehoshua_Bariah;

import java.util.Scanner;

public class CommandAddAnswerToQuestion implements Command{
	private GetInfoAddAnswerToQuestion info;
	
	public CommandAddAnswerToQuestion(GetInfoAddAnswerToQuestion inf) {
		this.info = inf;
	}

	@Override
	public void execute(Scanner input, Repository repository) {
		this.info.addAnswerToQuestion(input, repository);;
	}
}
